package com.sceddinfo.sms.rest.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("restModelMapperImp")
public class ModelMapperImpl {

	@Autowired
	ModelMapper modelMapper;


	public <T> Object convert(Object source,Class<T> clazz) {
		return modelMapper.map(source, clazz);
	}


}