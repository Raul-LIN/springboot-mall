package com.Tank.springbootmall.service;

import com.Tank.springbootmall.dto.CreateOrderRequest;
import com.Tank.springbootmall.dto.OrderQueryParams;
import com.Tank.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
