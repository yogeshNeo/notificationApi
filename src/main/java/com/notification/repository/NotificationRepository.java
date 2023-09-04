package com.notification.repository;

import com.notification.model.Notification;
import org.springframework.data.repository.CrudRepository;

public interface NotificationRepository extends CrudRepository<Notification,Long> {

}