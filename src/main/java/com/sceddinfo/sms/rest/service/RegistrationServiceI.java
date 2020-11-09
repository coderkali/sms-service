package com.sceddinfo.sms.rest.service;

import org.springframework.stereotype.Service;

import com.sceddinfo.sms.rest.dto.RegistrationDTO;

@Service
public interface RegistrationServiceI {

	public RegistrationDTO saveUser(RegistrationDTO regDTO);
}
