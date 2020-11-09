package com.sceddinfo.sms.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class RegistrationDTO extends BaseDTO {
	
	private static final long serialVersionUID = 4433102851582968952L;

	private Long regId;

	private Long userRoleId;

	private String fullName;

	private String mobileNumber;

	private String emailId;

	private AddressDTO addressDto;

}