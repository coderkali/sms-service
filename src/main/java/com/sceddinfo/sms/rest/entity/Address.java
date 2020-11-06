package com.sceddinfo.sms.rest.entity;

import javax.persistence.*;

import com.sceddinfo.sms.rest.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "Address")
public class Address extends BaseEntity {

	private static final long serialVersionUID = 1253704382470032435L;

	@Column(name = "Address_Id")
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long addressId;

	@Column(name = "Address")
	private String address;

	@Column(name = "City")
	private String city;

	@Column(name = "State")
	private String state;

	@Column(name = "Pincode")
	private String pincode;
}