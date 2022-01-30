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
public class LoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer lid;
	private Integer custId;

	private Double lamt;
	private Double rateOfInterest;
	private Double tenure;
	private Double totalAmtToBePaid;
	private Double processingFee;
	private Double interest;
	private String sanctionDate;
	private String status;
	private String remark;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EmiDetails emidetails;


}
