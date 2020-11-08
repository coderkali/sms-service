package com.sceddinfo.sms.rest.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name="Registered_User")
public class RegisteredUser extends BaseEntity {

	private static final long serialVersionUID = -6603441918065684365L;

	@Column(name="User_Id",insertable=true)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;

	@Column(name="Reg_Id")
	private Long regId;

	@Column(name="Is_Active")
	private String isActive;

	@Column(name="First_Time_Login")
	private String firtTimeLogin;

	@OneToMany(mappedBy = "regUserId", orphanRemoval = true)
	private Set<UserRole> userRole;

	/*@OneToMany(mappedBy = "permisionUserId",cascade=CascadeType.ALL)
	private Set<UserPermission> userPermission;*/

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Reg_Id")
	private Registration registration;





}