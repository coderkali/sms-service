package com.sceddinfo.sms.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sceddinfo.sms.rest.dto.RegistrationDTO;
import com.sceddinfo.sms.rest.entity.Registration;
import com.sceddinfo.sms.rest.repository.RegistrationRepositoryI;
import com.sceddinfo.sms.rest.util.ModelMapperImpl;

@Service
public class RegistrationServiceImpl implements RegistrationServiceI {

	@Autowired
	RegistrationRepositoryI regRepo;

	@Autowired
	ModelMapperImpl modelmapper;

	@Override
	public RegistrationDTO saveUser(RegistrationDTO regDTO) {
		Registration convert = (Registration) modelmapper.convert(regDTO, Registration.class);
		Registration save = regRepo.save(convert);
		return (RegistrationDTO) modelmapper.convert(save, RegistrationDTO.class);
	}

}
