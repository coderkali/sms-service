package com.sceddinfo.sms.rest.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="Created_By")
	private String createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Created_Date")
	private Date createdDate;
	
	@Column(name="Modified_By")
	private String modifiedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="Modified_Date")
	private Date modifiedDate;

}