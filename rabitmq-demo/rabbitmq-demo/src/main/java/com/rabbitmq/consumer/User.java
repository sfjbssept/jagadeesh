package com.rabbitmq.consumer;

import com.rabbitmq.config.MessaginConfig;
import com.rabbitmq.entity.EmployeeStatus;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

	@RabbitListener(queues = MessaginConfig.QUEUENAME)
	public void consumerMessageFromQueue(EmployeeStatus employeeStatus) {
		System.out.println("Message Received" + employeeStatus);
	}
}
