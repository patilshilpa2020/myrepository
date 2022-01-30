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
public class CustBankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accId;
	private Long accNumber;
	private String accType;
//	private Double accBal;
	private String accHolderName;
	private String accStatus;
	private String bankName;
	private String accIFSC;
	

}








