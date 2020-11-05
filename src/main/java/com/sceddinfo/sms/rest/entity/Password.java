package com.sceddinfo.sms.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sceddinfo.sms.rest.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "Password")
public class Password extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -187049045205776868L;

	@Column(name = "Password_Id")
	@Id
	private String passwordId;

	@Column(name = "Password")
	private String password;

	@Column(name = "User_Id")
	private String userId;

}