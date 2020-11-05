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
@Table(name = "User_Permission")
public class UserPermission extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1276197954702947483L;

	@Column(name = "User_Permission_Id")
	@Id
	private String userPermissionId;

	@Column(name = "User_Id")
	private String userId;

	@Column(name = "Permission_Id")
	private String permissionId;

}
