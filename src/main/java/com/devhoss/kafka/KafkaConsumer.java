package com.devhoss.kafka;

import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	//@KafkaListener(topics ="testtopicreplication3", groupId ="devhoss-group")

 // bloques de  10 registros dentro de los 4 segundos
	@KafkaListener(topics ="testtopicreplication3",containerFactory ="kafkaListenerContainerFactory",groupId ="devhoss-group", properties =
		{"max.poll.interval.ms:4000","max.poll.records:10"})
	public void listen(List<String> messages) {
		
		System.out.println("Inicio Batch...");
		for (String message : messages) {
			System.out.println("Received Messasge  :"+ message);
		}
		System.out.println("Completado bash...");
		
	}
}
