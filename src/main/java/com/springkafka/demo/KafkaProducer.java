package com.springkafka.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
	
	private static final String TOPIC = "topic";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void writeMessage(String msg) {
		kafkaTemplate.send(TOPIC, msg);
	}

}
