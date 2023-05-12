package com.codreanvs.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
public class SimpleMessageConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(SimpleMessageConsumer.class);

    @KafkaListener(groupId = "simple-group", topics = "default-topic")
    public void consumeFromDefaultTopic(final String message) throws UnknownHostException {
        LOG.info("The message '{}' has been successfully received from 'default-topic' topic, {}.", message, getLocalHostName());
    }

    @KafkaListener(groupId = "simple-group", topics = "custom-topic")
    public void consumeFromCustomTopic(final String message) throws UnknownHostException {
        LOG.info("The message '{}' has been successfully received from 'custom-topic' topic, {}.", message, getLocalHostName());
    }

    private String getLocalHostName() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostName();
    }

}
