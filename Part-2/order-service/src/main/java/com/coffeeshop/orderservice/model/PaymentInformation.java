package com.coffeeshop.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payment_information")
public class PaymentInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentInfoId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String paymentMethod;
    private String cardNumber;
    private String expiryDate;
}
