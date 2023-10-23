package com.devhoss.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	@KafkaListener(topics ="testtopicreplication3", groupId ="devhoss-group")
	public void listen(String message) {
		System.out.println("RECIBIENDO...");
		System.out.println("Received Messasge  :"+ message);
	}
}
