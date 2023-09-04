package com.notification.controller;

import com.notification.model.Notification;
import com.notification.model.Shipment;
import com.notification.repository.NotificationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class NotificationController {

    @Autowired
    private NotificationRepository repository;

    @PostMapping("/sendNotification")
    public void sendNotification(@RequestBody Shipment shipment) {
        Notification notify = new Notification();
        log.info("Inside sendNotification ::");
        notify.setOrderId(shipment.getOrderId());
        notify.setStatus("Notification Send Successfully");
        repository.save(notify);
    }

}
