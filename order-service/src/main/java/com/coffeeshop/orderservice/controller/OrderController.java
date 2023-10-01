package com.coffeeshop.orderservice.controller;


import com.coffeeshop.orderservice.request.OrderRequest;
import com.coffeeshop.orderservice.response.OrderResponse;
import com.coffeeshop.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {

    private final OrderService orderService;


    //Place an order 
    @PostMapping
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest){
        OrderResponse orderResponse =orderService.placeOrder(orderRequest);
        return  ResponseEntity.ok(orderResponse);
    }


}
