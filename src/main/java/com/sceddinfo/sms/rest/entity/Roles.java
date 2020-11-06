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
@Table(name = "Roles")
public class Roles {

	private static final long serialVersionUID = 4538994307469667633L;

	@Column(name = "Role_Id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long roleId;

	@Column(name = "Role_Desc")
	private String roleDesc;

}