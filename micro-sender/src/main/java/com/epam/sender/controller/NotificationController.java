package com.epam.sender.controller;

import com.epam.sender.dto.Notification;
import com.epam.sender.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void sendMessage(@RequestBody Notification notification) {
        log.info("Received message from user {} : {}", notification.getUser(), notification.getMessage());
        notificationService.sendMessage(notification.getMessage());
    }
}
