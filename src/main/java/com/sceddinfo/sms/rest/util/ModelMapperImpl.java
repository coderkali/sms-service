package com.sceddinfo.sms.rest.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperImpl {

	@Autowired
	ModelMapper modelMapper;
	public Object convert(Object source,Class clazz) {
		return modelMapper.map(source, clazz);
	}
}