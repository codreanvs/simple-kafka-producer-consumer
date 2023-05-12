package com.codreanvs.kafka.web.rest.controllers;

import com.codreanvs.kafka.services.SimpleMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/messages")
public class SimpleMessageController {

    private final SimpleMessageService simpleMessageService;

    @PostMapping("/default-topic")
    public void sendToDefaultTopic(@RequestBody final String message) {
        simpleMessageService.sendToDefaultTopic(message);
    }

    @PostMapping("/custom-topic")
    public void sendToCustomTopic(@RequestBody final String message) {
        simpleMessageService.sendToCustomTopic(message);
    }

}
