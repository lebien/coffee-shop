package com.coffeeshop.orderservice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @OneToMany(cascade=CascadeType.ALL)
    private List<ServingHistory> servingHistories;

    private String name;

    @Column(name = "mobile_phone")
    private String mobilePhone;

    private String address;

    private String email;
}
