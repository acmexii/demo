package com.example.demo;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler {
    @StreamListener(Processor.INPUT)
    public void onEventByString(@Payload ProductChanged productChanged){
        // Business Logic, or Rules.
        // Save Local Repository(Aggregate)
        System.out.println(productChanged.getEventType());
        System.out.println(productChanged.getProductName());
        System.out.println(productChanged.getProductStock());
    }
}
