package com.sceddinfo.sms.rest.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseDTO implements Serializable {

	private static final long serialVersionUID = 2441366507039399727L;


	@JsonInclude(Include.NON_EMPTY)
	private String createdBy;
	
	@JsonIgnore
	private Date createdDate;
	
	@JsonInclude(Include.NON_EMPTY)
	private String modifiedBy;
	
	@JsonIgnore
	private Date modifiedDate;

}