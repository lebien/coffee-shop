package com.coffeeshop.orderservice.service;

import com.coffeeshop.orderservice.request.OrderRequest;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService{

    @Override
    public void placeOrder(OrderRequest orderRequest) {
        //do something
    }
}
