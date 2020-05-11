package com.pinoyjavatech.sample;

import org.springframework.messaging.Message;

public class PrintService {
	
	public void printStr(Message<?> message) {
		System.out.println(message.getPayload());
	}
	
	public void printRecieved(Message<?> message) {
		System.out.println(message);
	}
}
