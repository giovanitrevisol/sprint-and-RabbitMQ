package com.gt.spring.producer.service.implementation;

import com.gt.spring.producer.amqp.AmqpProducer;
import com.gt.spring.producer.dto.MessageQueue;
import com.gt.spring.producer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService implements AmqpService {

    @Autowired
    private AmqpProducer<MessageQueue> amqp;

    @Override
    public void sendToConsumer(MessageQueue message) {
        amqp.producer(message);
    }
}
