package com.devhoss.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer implements CommandLineRunner {


	@Autowired
	private KafkaTemplate<Integer, String> kafkaTemplate;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ENVIANDOO...");
		kafkaTemplate.send("testtopicreplication3","Mensaje de producer kafka");
	}
}
