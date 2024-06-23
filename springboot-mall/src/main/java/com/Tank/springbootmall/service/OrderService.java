package com.Tank.springbootmall.service;

import com.Tank.springbootmall.dto.CreateOrderRequest;
import com.Tank.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
