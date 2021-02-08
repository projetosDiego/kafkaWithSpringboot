package com.springkafka.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics="topic", groupId="id")
	public void getMessage(String message) {
		System.out.println(message);
	}

}
