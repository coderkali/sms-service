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
@Table(name = "User_Permission")
public class UserPermission extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1276197954702947483L;

	@Column(name = "User_Permission_Id")
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long userPermissionId;

	@Column(name = "User_Id")
	private Long userId;

	@Column(name = "Permission_Id")
	private Long permissionId;

}
