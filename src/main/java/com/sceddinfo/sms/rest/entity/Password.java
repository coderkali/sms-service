package com.sceddinfo.sms.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Password")
public class Password extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = -187049045205776868L;

	@Column(name = "Password_Id")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long passwordId;

	@Column(name = "Password")
	private String password;

	@OneToOne
	@JoinColumn(name = "User_Id",referencedColumnName="User_Id")
	private RegisteredUser regUser;
}
