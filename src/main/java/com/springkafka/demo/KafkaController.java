package com.springkafka.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
	
	@Autowired
	private KafkaProducer producer;
	
	@PostMapping("/publish")
	public void writeMessageToTopic(@RequestParam("message") String message) {
		producer.writeMessage(message);
	}
	
	@GetMapping("/teste")
	public String teste() {
		return "Funcionou!!";
	}

}