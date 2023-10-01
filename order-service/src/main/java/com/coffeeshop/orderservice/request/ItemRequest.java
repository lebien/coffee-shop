package com.coffeeshop.orderservice.request;

import com.coffeeshop.orderservice.model.Menu;
import com.coffeeshop.orderservice.model.Order;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemRequest {

    private Long itemId;

    private String itemName;

    private BigDecimal price;

    private String description;

    private Integer quantity;
}
