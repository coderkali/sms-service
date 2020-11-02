package com.sceddinfo.sms.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name="Registerd_User")
public class User extends BaseEntity {

	private static final long serialVersionUID = -6603441918065684365L;
	
	@Column(name="User_Id")
	@Id
	private String userId;
	
	@Column(name="Reg_Id")
	private String regId;
	
	@Column(name="Is_Active")
	private String isActive;
	
	@Column(name="First_Time_Login")
	private String firtTimeLogin;

}