package com.cjc.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmiDetails {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer emiId;
	private Double emiMonthlyPaid;
	private String emiNextDueDate;
	private String previousEmiStatus;

}
