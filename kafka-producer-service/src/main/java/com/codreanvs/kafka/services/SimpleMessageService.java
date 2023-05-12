package com.codreanvs.kafka.services;

public interface SimpleMessageService {

    void sendToDefaultTopic(String message);

    void sendToCustomTopic(String message);

}
