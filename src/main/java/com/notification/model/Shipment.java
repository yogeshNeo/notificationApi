package com.notification.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String address;

    @Column
    private String status;

    @Column
    private long orderId;
}
