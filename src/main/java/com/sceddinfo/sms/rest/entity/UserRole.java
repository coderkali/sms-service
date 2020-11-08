package com.sceddinfo.sms.rest.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@ManyToOne
	@JoinColumn(name = "User_Id")
	private RegisteredUser regUserId;

	@ManyToOne
	@JoinColumn(name = "Role_Id")
	private Roles roles;

}
