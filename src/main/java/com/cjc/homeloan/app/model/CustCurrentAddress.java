package com.cjc.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CustCurrentAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer aid;
private Integer houseNo;
private String city;
private Integer pincode;
private String streetName;
private String area;
private String landmark;
private String taluka;
private String district;
private String state;
private String country;
}
