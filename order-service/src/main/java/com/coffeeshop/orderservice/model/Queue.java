package com.coffeeshop.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "queues")
public class Queue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "queue_id")
    private Long queueId;

    @OneToMany(cascade=CascadeType.ALL)
    private List<ServingHistory> servingHistories;

    @Column(name = "queue_number")
    private Integer queueNumber;

    @Column(name = "queue_size")
    private Integer queueSize;

    // 1 = available, 0 = unavailable
    @Column(name = "current_status")
    private Boolean currentStatus;



}
