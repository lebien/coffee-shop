package com.coffeeshop.orderservice.request;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private Long shopId;
    private Long userId;
    private Set<ItemRequest> itemRequests;
}
