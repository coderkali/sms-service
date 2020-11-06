package com.sceddinfo.sms.rest.entity;

import javax.persistence.*;

import com.sceddinfo.sms.rest.entity.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "Permission")
public class Permission extends BaseEntity {

	private static final long serialVersionUID = -7042685098683711987L;

	@Id
	@Column(name = "Permission_Id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long permissionId;

	@Column(name = "Permission_Desc")
	private String permissionDesc;

	public Long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionDesc() {
		return permissionDesc;
	}

	public void setPermissionDesc(String permissionDesc) {
		this.permissionDesc = permissionDesc;
	}

	
	
}