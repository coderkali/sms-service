package com.sceddinfo.sms.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class PasswordDTO extends BaseDTO {

	private static final long serialVersionUID = 1670126716342113115L;

	private Long passwordId;

	private String password;

	private String userId;
}
