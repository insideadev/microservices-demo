package com.epam.recipient.service;

import com.epam.recipient.dto.MessageDto;
import com.epam.recipient.entity.Message;

import java.util.List;

public interface MessageService {
    Message saveMessage(String info);

    List<MessageDto> findAllAndDelete();
}
