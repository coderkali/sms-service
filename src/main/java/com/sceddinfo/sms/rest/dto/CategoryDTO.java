package com.sceddinfo.sms.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CategoryDTO extends BaseDTO {

	private static final long serialVersionUID = 5022345454957102726L;

	private String categoryId;

	private String categoryDesc;

}