package com.sceddinfo.sms.rest.dto;

import com.sceddinfo.sms.rest.entity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class RegisteredUserDTO extends BaseDTO {

	private static final long serialVersionUID = -7909389221793837878L;

	private String userId;
	
	private String regId;
	
	private String isActive;
	
	private String firtTimeLogin;

}
