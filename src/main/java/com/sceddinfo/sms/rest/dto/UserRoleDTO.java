package com.sceddinfo.sms.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserRoleDTO extends BaseDTO {

	private static final long serialVersionUID = -4908641079956173381L;

	private Long userRoleId;

	private Long userId;

	private Long roleId;

}
