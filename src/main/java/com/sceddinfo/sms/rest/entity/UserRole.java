package com.sceddinfo.sms.rest.entity;

import javax.persistence.*;

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
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long userRoleId;

	@Column(name = "User_Id")
	private Long userId;

	@Column(name = "Role_Id")
	private Long roleId;

}
