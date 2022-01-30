package com.cjc.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CustProfessionDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer prId;	
	private String presentEmployer;	
	private String designation;	
	private String currentOccupation;	
	private Integer yoe;

}
