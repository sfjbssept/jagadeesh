package com.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class KafkaServiceApplication {

	@Autowired
	private KafkaTemplate<String, Object> template;
	
	private String topic = "spring-kafka2";
	
	@GetMapping("/publish/{name}")
	public String publishMessage(@PathVariable String name) {
		template.send(topic,"Hi "+name+" this is inform that this message is coming from your kafka publisher");
	return "data has been published";
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaServiceApplication.class, args);
	}

}
