package com.cjc.homeloan.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class CustGurantor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer grid;
	private String grName;
	private String grDOB;
	private String grGender;
	private String grMaretialStatus;
	private String custRelation;
	private String grOccupation;
	private Long grMobno;
	private Long grAadhaar;
	private String grPAN;
	private Double grAnnualIncome;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustPermanentAddress grAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustProfessionDetails grprfdetails;

}
