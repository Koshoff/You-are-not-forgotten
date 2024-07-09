package com.example.You.are.not.forgotten.repositories;

import com.example.You.are.not.forgotten.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
