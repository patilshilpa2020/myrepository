package com.cjc.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CustPreviousLoan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ploanId;	
	private Double ploanAmt;	
	private Double ploanTenure;	
	private Double paidAmt;	
	private Double remainingAmt;	
	private Integer defaulterCount;
	private String pbankDetails;

}
