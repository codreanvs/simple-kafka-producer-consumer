package com.codreanvs.kafka.services.impl;

import com.codreanvs.kafka.producers.SimpleMessageProducer;
import com.codreanvs.kafka.services.SimpleMessageService;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleMessageServiceImpl implements SimpleMessageService {

    private final NewTopic customTopic;

    private final SimpleMessageProducer simpleMessageProducer;

    @Override
    public void sendToDefaultTopic(final String message) {
        simpleMessageProducer.produceToDefaultTopic(message);
    }

    @Override
    public void sendToCustomTopic(final String message) {
        simpleMessageProducer.produceToTopic(customTopic.name(), message);
    }

}
