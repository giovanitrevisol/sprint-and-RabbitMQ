package com.gt.spring.consumer.serice;

import com.gt.spring.consumer.dto.MessageQueue;

public interface ConsumerService {

    void action(MessageQueue messageQueue) throws Exception;
}
