package com.sceddinfo.sms.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sceddinfo.sms.rest.dto.RegistrationDTO;
import com.sceddinfo.sms.rest.service.RegistrationServiceI;

@RestController
public class RegistrationController {
	@Autowired
	RegistrationServiceI regServiceI;

	@RequestMapping(value = "/regUser", method = RequestMethod.POST)
	public ResponseEntity<RegistrationDTO> getSaved(@RequestBody RegistrationDTO regDTO) {
		RegistrationDTO regRespo = regServiceI.saveUser(regDTO);
		return new ResponseEntity<>(regRespo, HttpStatus.CREATED);
	}
}
