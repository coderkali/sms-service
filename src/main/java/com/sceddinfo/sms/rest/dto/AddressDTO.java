package com.sceddinfo.sms.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AddressDTO extends BaseDTO {

	private static final long serialVersionUID = -3214541158617802247L;

	private Long addressId;

	private String address;

	private String city;

	private String state;

	private String pincode;

}
