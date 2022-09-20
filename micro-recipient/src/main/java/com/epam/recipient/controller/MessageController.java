package com.epam.recipient.controller;


import com.epam.recipient.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public ResponseEntity<?> getMessages() {
        log.info("Getting message list and clean...");
        return ResponseEntity.ok(messageService.findAllAndDelete());
    }
}
