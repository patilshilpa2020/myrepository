package com.cjc.homeloan.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class CustomerRegistration {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer custId;
private String custName;
private String custEmail;
private Long custMobNo;
private Long custAlternateNo;
private String custDOB;
private String custGender;
private String custMaritalStatus;	
private Integer custCibilScore;
private String verifStatus;

@OneToOne(cascade = CascadeType.ALL)
private CustCurrentAddress custcuraddr;

@OneToOne(cascade = CascadeType.ALL)
private CustPermanentAddress custperaddr;

@OneToMany(cascade = CascadeType.ALL)

private List<CustGurantor> custguarant;

@OneToOne(cascade = CascadeType.ALL)
private CustProfessionDetails custprofdet;

@OneToOne(cascade = CascadeType.ALL)
private CustBankDetails custbankdet;

@OneToOne(cascade = CascadeType.ALL)
private CustDoc custdoc;

@OneToMany(cascade = CascadeType.ALL)

private List<CustPreviousLoan> custprloan;

@OneToOne(cascade = CascadeType.ALL)
private PropertyDetails propdetails;



}

