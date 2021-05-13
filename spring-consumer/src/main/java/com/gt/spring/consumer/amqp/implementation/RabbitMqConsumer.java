package com.gt.spring.consumer.amqp.implementation;

import com.gt.spring.consumer.amqp.AmqpConsumer;
import com.gt.spring.consumer.dto.MessageQueue;
import com.gt.spring.consumer.serice.ConsumerService;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqConsumer  implements AmqpConsumer<MessageQueue> {

    @Autowired
    private ConsumerService consumerService;

    @Override
    @RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
    public void consumer(MessageQueue messageQueue) {
        try {
            consumerService.action(messageQueue);
        } catch (Exception ex) {
            throw new AmqpRejectAndDontRequeueException(ex);
        }
    }
}
