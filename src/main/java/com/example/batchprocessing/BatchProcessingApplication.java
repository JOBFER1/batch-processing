package com.example.batchprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchProcessingApplication {

	public static void main(String[] args) {
		
//		var context = SpringApplication.run(BatchProcessingApplication.class, args);
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
//		SpringApplication.run(BatchProcessingApplication.class, args);
		System.exit(SpringApplication.exit(SpringApplication.run(BatchProcessingApplication.class, args)));
	}

}
