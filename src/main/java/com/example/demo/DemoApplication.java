package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.ApplicationContext;
import org.springframework.messaging.handler.annotation.Payload;

@SpringBootApplication
@EnableBinding(Processor.class)
public class DemoApplication {
	public static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(DemoApplication.class, args);
	}

	@StreamListener(Processor.INPUT)
	public void onEventByString(@Payload ProductChanged productChanged){
		System.out.println(productChanged.getEventType());
	}
}