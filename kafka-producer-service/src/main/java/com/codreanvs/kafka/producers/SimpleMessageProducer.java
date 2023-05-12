package com.codreanvs.kafka.producers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class SimpleMessageProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void produceToDefaultTopic(final String message) {
        kafkaTemplate.sendDefault(message);
        log.info("The message '{}' has been successfully sent to 'default-topic' topic.", message);
    }

    public void produceToTopic(final String topic, final String message) {
        kafkaTemplate.send(topic, message);
        log.info("The message '{}' has been successfully sent to '{}' topic.", message, topic);
    }

}
