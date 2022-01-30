package com.cjc.homeloan.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 
import com.cjc.homeloan.app.model.LoanDisbursementDetails;
import com.cjc.homeloan.app.servicedec.LoanDisbursementDetailsDec;

@RestController
public class LoanDisbursementDetailsController {
	
	@Autowired
	private LoanDisbursementDetailsDec loanDisburseservice;
	
	@PostMapping("/saveLoanDisbursementDetails")
	public ResponseEntity<String> saveLoanDisbursementDetails(@RequestBody LoanDisbursementDetails loanDisburse){
		loanDisburseservice.saveLoanDisbursementDetails(loanDisburse);
		return new ResponseEntity<String>("Successfully disbursed", HttpStatus.CREATED);
	}
	
	
	@GetMapping("/viewLoanDisbursementDetails")
	public  ResponseEntity<List<LoanDisbursementDetails>> viewLoanDisbursementDetails() {
		List<LoanDisbursementDetails> loanDisbursementDetailsList = loanDisburseservice.viewLoanDisbursementDetails();
		return new ResponseEntity<List<LoanDisbursementDetails>>(loanDisbursementDetailsList, HttpStatus.OK);
	}
	
	
	@GetMapping("/viewLoanDisbursementDetails/{disburseId}")
	public  ResponseEntity<LoanDisbursementDetails> loanDisbursementDetails(@PathVariable Integer disburseId) {
		LoanDisbursementDetails loanDisbursementDetailsObj = loanDisburseservice.loanDisbursementDetails(disburseId);
		return new ResponseEntity<LoanDisbursementDetails>(loanDisbursementDetailsObj, HttpStatus.OK);
	}

}
