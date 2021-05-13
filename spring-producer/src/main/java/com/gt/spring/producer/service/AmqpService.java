package com.gt.spring.producer.service;

import com.gt.spring.producer.dto.MessageQueue;

public interface AmqpService {

    void sendToConsumer(MessageQueue message);
}
