package com.sceddinfo.sms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdvanceSmsServiceApplication {

	private static final Logger logger = LoggerFactory.getLogger(AdvanceSmsServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AdvanceSmsServiceApplication.class, args);
		logger.info("---------Spring Boot Application Start-------------");

	}

}
