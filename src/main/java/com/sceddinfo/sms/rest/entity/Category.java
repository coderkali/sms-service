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
@Table(name = "Category")
public class Category extends BaseEntity {

	private static final long serialVersionUID = 1298810256911244348L;

	@Column(name = "Category_Id")
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long categoryId;

	@Column(name = "Category_Desc")
	private String categoryDesc;

}