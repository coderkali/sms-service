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

import org.springframework.stereotype.Component;

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
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Permission_Id")
	private Long permissionId;

	@Column(name = "Permission_Desc")
	private String permissionDesc;

}