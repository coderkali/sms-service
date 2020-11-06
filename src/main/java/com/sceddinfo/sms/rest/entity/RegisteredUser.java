package com.sceddinfo.sms.rest.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name="Registered_User")
public class RegisteredUser extends BaseEntity {

	private static final long serialVersionUID = -6603441918065684365L;
	

	@Id
	@Column(name="User_Id",insertable=true)
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long userId;
	
	@Column(name="Reg_Id")
	private String regId;
	
	@Column(name="Is_Active")
	private String isActive;
	
	@Column(name="First_Time_Login")
	private String firtTimeLogin;

	//@OneToOne(mappedBy = "regUser")
    //private Password pass;

}