package com.sceddinfo.sms.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping(value="/test")
	public String testSpringAOP() {
		return "test";
	}

}
