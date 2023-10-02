package com.coffeeshop.orderservice.service;

import com.coffeeshop.orderservice.request.OrderRequest;
import com.coffeeshop.orderservice.response.OrderResponse;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
