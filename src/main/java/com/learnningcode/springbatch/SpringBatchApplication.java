package com.learnningcode.springbatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:database.xml")
@EntityScan(basePackages = "com.learnningcode.springbatch")
public class SpringBatchApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(SpringBatchApplication.class, args);
	}

}
