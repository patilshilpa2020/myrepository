package com.cjc.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class LoanDisbursementDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer disburseId;
	private Integer custId;
	private Integer loanNo;
	private String agreementDate;
	private String paymentMode;
	private Double totAmt;
	private String bankName;
	private Long accNo;
	private String ifscCode;
	private String accoutType;
	private Double transferAmt;
	private String paymentStatus;
	private String amtPaidDate;

}
