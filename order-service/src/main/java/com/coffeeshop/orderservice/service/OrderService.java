package com.coffeeshop.orderservice.service;

import com.coffeeshop.orderservice.request.OrderRequest;

public interface OrderService {
    void placeOrder(OrderRequest orderRequest);
}
