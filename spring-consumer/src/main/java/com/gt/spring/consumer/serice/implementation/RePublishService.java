package com.gt.spring.consumer.serice.implementation;

import com.gt.spring.consumer.amqp.AmqpRePublish;
import org.springframework.beans.factory.annotation.Autowired;

public class RePublishService implements com.gt.spring.consumer.serice.RePublishService {

    @Autowired
    private AmqpRePublish rePublish;


    @Override
    public void repost() {
        rePublish.rePublish();
    }
}
