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
@Table(name = "shops")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id")
    private Long shopId;

    @OneToMany(cascade=CascadeType.ALL)
    private List<Order> orders;

    @OneToMany(cascade=CascadeType.ALL)
    private List<Menu> menus;

    @OneToMany(cascade=CascadeType.ALL)
    private List<Queue> queues;

    @OneToMany(cascade=CascadeType.ALL)
    private List<ServingHistory> servingHistories;

    private String name;

    private String location;

    @Column(name = "contact_detail")
    private String  contactDetail;

    @Column(name = "open_time")
    private String openTime;

    @Column(name = "close_time")
    private String closeTime;

    @Column(name = "max_queues")
    private Integer maxQueues;




}
