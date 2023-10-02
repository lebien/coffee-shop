package com.coffeeshop.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "queue_status")
public class QueueStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long queueStatusId;

    @ManyToOne
    @JoinColumn(name = "queue_id")
    private Queue queue;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userUser;

    private Integer position;

    @Column(name = "estimate_pick_up_time")
    private LocalDateTime estimatedPickupTime;
}
