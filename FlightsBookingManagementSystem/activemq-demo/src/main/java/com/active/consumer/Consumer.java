package com.active.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination = "standalone.queue")
	public void consumer(String msg) {
		System.out.println("the message that has to be published is consumed" + msg);
	}
}
