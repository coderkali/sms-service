package com.sceddinfo.sms.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "USER_PERMISSION")
public class UserPermission extends BaseEntity {

	private static final long serialVersionUID = 1276197954702947483L;

	@Id
	@Column(name="User_Permission_Id")
	private Long  userPermissionId;


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "User_Id")
	private RegisteredUser userId;


	@Column(name="Permission_Id")
	private Long permissionId;

}