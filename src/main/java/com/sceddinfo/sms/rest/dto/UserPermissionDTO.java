package com.sceddinfo.sms.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserPermissionDTO extends BaseDTO {

	private static final long serialVersionUID = -8789129748154886359L;

	private Long userPermissionId;

	private Long userId;

	private Long permissionId;

}