package com.gt.spring.consumer.api;

import com.gt.spring.consumer.serice.RePublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public class AmqpApi {

    @Autowired
    private RePublishService service;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/repost")
    public void sendToQueue() {
        service.repost();
    }

}
