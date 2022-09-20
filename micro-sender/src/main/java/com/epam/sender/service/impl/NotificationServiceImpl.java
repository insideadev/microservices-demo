package com.epam.sender.service.impl;

import com.epam.sender.dto.MessageDto;
import com.epam.sender.service.NotificationService;
import com.epam.sender.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private RabbitMQSender mqSender;

    @Override
    public void sendMessage(String message) {
        mqSender.send(new MessageDto(message));
    }
}
