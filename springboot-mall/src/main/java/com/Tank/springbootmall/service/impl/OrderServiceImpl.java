package com.Tank.springbootmall.service.impl;

import com.Tank.springbootmall.dao.OrderDao;
import com.Tank.springbootmall.dao.ProductDao;
import com.Tank.springbootmall.dto.BuyItem;
import com.Tank.springbootmall.dto.CreateOrderRequest;
import com.Tank.springbootmall.model.OrderItem;
import com.Tank.springbootmall.model.Product;
import com.Tank.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @Transactional
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {
        int totalAmount = 0;
        List<OrderItem> orderItemList = new ArrayList<>();

        for (BuyItem buyItem : createOrderRequest.getBuyItemList()) {
            Product product = productDao.getProductById(buyItem.getProductId());

            //  計算總價
            int amount = buyItem.getQuantity() * product.getPrice();
            totalAmount += amount;

            //  轉換 BuyItem to OrderItem
            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(buyItem.getProductId());
            orderItem.setQuantity(buyItem.getQuantity());
            orderItem.setAmount(amount);

            orderItemList.add(orderItem);
        }

        //  創建訂單
        Integer orderId = orderDao.createOrder(userId, totalAmount);

        orderDao.createOrderItems(orderId, orderItemList);

        return orderId;
    }
}