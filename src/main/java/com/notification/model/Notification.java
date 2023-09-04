package com.notification.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String status;

    @Column
    private long orderId;
}
