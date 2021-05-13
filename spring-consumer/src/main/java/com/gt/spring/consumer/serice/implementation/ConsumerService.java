package com.gt.spring.consumer.serice.implementation;

import com.gt.spring.consumer.dto.MessageQueue;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService implements com.gt.spring.consumer.serice.ConsumerService {

    @Override
    public void action(MessageQueue message) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(message.getText());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
    }
}
