package com.epam.collector.job;

import com.epam.collector.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MessageScheduler {

    private final MessageService messageService;

    @Scheduled(cron = "*/10 * * * * *")
    public void getMessages() {
        log.info("Calling getMessages()");
        var resp = messageService.getMessages();
        log.info("Response: ");
        resp.forEach(System.out::println);
    }
}
