package com.epam.collector.service;

import com.epam.collector.dto.MessageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "MessageFeinClient", url = "${recipient.url}")
public interface MessageService {

    @GetMapping("/messages")
    List<MessageDto> getMessages();
}
