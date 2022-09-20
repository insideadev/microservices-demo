package com.epam.recipient.service.impl;

import com.epam.recipient.dto.MessageDto;
import com.epam.recipient.entity.Message;
import com.epam.recipient.repository.MessageRepository;
import com.epam.recipient.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository repository;

    @Override
    public Message saveMessage(String info) {
        return repository.save(new Message(info));
    }

    @Override
    public List<MessageDto> findAllAndDelete() {
        List<Message> messageList = repository.findAll();
        repository.deleteAll(messageList);
        return messageList
                 .stream()
                 .map(MessageDto::new)
                 .collect(Collectors.toList());
    }
}
