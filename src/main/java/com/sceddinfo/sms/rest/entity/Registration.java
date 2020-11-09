package com.sceddinfo.sms.rest.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name = "Registration")
public class Registration extends BaseEntity {

	private static final long serialVersionUID = 5336663038692541157L;

	@Column(name = "Red_Id")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long regId;

	@Column(name = "User_Role_Id")
	private Long userRoleId;

	@Column(name = "Full_Name")
	private String fullName;

	@Column(name = "Mobile_Number")
	private String mobileNumber;

	@Column(name = "Email_Id")
	private String emailId;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "Address_Id", referencedColumnName = "Address_Id", unique = true)
	private Address address;

}