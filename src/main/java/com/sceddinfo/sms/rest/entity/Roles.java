package com.sceddinfo.sms.rest.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "Roles")
public class Roles extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 4538994307469667633L;

	@Column(name = "Role_Id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long roleId;

	@Column(name = "Role_Desc")
	private String roleDesc;

	@OneToMany(mappedBy = "roles", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<UserRole> userRole;

}