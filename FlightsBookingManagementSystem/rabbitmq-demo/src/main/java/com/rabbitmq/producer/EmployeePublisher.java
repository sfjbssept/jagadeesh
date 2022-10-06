package com.rabbitmq.producer;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.rabbitmq.config.MessaginConfig;
import com.rabbitmq.entity.Employee;
import com.rabbitmq.entity.EmployeeStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@RestController
@RequestMapping("/Employee")
public class EmployeePublisher {

	@Autowired
	private RabbitTemplate template;
	
	@PostMapping("/{companyname}")
public String saveEmployee(@RequestBody Employee employee, @PathVariable String companyname){
		employee.setEmpId(UUID.randomUUID().toString());
		
		EmployeeStatus employeeStatus = new EmployeeStatus(employee, "joined", "Has recently joined the company and is going through the onboarding process in "+companyname);
		
		template.convertAndSend(MessaginConfig.EXCAHGENAME, MessaginConfig.ROUTING_KEY, employeeStatus);
		return "success!";
		
	}
}
