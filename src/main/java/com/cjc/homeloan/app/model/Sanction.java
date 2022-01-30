package com.cjc.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Sanction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private Integer custId;
	private String sanctionDate;
	private String applicantName;
	private Long contactDetails;
	private Double loanAmtSanctioned;
	private String interestType;
	private Double rateOfInterest;
	private Double loanTenure;
	private Double monthlyEMI;
	private String modeOfPayment;
	private String remark;
	private String termsNCondition;
	private String status;

}
