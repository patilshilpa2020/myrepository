package com.cjc.homeloan.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
public class Ledger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ledId;
	private Integer custId;
	@CreationTimestamp
	private Date ledCreatedDate;
	@UpdateTimestamp
	private Date ledModifyDate;
	private Double totalLoanAmt;
	private Double payableAmtWithInterest;
	private Double tenure;
	private Double monthlyEMI;
	private Double amountPaidTillDate;
	private Double remainingAmount;
	private String nextEMIDateStart;
	private String nextEMIDateEnd;
	private Integer defaulterCount;
	private String previousEmiStatus;
	private String currentMntEMIStatus;
	private String loanEndDate;
	private String loanStatus;
	
}
