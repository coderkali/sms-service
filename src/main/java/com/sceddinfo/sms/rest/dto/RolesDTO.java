package com.sceddinfo.sms.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class RolesDTO extends  BaseDTO {

	private static final long serialVersionUID = 1753696150313210677L;

	private Long roleId;

	private String roleDesc;

}
