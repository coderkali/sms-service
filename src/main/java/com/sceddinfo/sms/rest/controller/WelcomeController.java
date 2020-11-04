package com.sceddinfo.sms.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "user", description = "Rest API for Advance Sms Servie", tags = "sunil api")
public class WelcomeController {

	@RequestMapping(value = "/hello/{name}")
	@ApiOperation(value = "Display Welcome message ", response = Greeting.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 404, message = "The resource not found") })
	public Greeting message(@PathVariable("name") String name) {
		Greeting msg = new Greeting(name, "Hello..... " + name);
		return msg;
	}

}