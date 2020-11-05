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
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "User_Role")
public class UserRole extends BaseEntity {

	private static final long serialVersionUID = 7869308842623114410L;

	@Column(name = "User_Role_Id")
	@Id
	private String userRoleId;

	@Column(name = "User_Id")
	private String userId;

	@Column(name = "Role_Id")
	private String roleId;

}
