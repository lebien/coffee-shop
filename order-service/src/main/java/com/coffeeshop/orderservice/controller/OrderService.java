package com.coffeeshop.orderservice.controller;


import com.coffeeshop.orderservice.request.OrderRequest;
import com.coffeeshop.orderservice.response.CommonResult;
import com.coffeeshop.orderservice.response.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderService {

    @PostMapping
    public ResponseEntity<CommonResult<OrderResponse>> placeOrder(OrderRequest orderRequest){


    }


}
