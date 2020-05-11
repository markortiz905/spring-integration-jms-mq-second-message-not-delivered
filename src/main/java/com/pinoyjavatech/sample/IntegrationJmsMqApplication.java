package com.pinoyjavatech.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("integration-context.xml")
public class IntegrationJmsMqApplication implements ApplicationRunner {

	@Autowired
	private PersonGateway gateway;
	
	public static void main(String[] args) {
		SpringApplication.run(IntegrationJmsMqApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		gateway.send(new Person(1, "Mark", "Pasig"));
		gateway.send(new Person(2, "Mark", "Pasig"));
//		gateway.send(new Person(3, "Mark", "Pasig"));
//		gateway.send(new Person(4, "Mark", "Pasig"));
//		gateway.send(new Person(5, "Mark", "Pasig"));
//		gateway.send(new Person(6, "Mark", "Pasig"));
	}
}
