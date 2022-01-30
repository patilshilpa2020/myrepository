package com.cjc.homeloan.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.homeloan.app.exception.LoanNotFoundException;
import com.cjc.homeloan.app.model.LoanDetails;
import com.cjc.homeloan.app.servicedec.LoanDetailsServiceDec;

@RestController
public class LoanDetailsController {
	@Autowired
	private LoanDetailsServiceDec loandetService;
	
	@PostMapping("/saveLoanDetails")
	public ResponseEntity<String> saveLoanDetails(@RequestBody LoanDetails loan) {
		String msg = loandetService.saveEnqiry(loan);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	@GetMapping("/viewLoanDetails")
	public  ResponseEntity<List<LoanDetails>> viewEnquiries() {
		List<LoanDetails> loanList = loandetService.viewLoanDetails();
		return new ResponseEntity<List<LoanDetails>>(loanList, HttpStatus.OK);
	}
	
	@GetMapping("/viewLoanDetails/{loanId}")
	public  ResponseEntity<LoanDetails> loanDetails(@PathVariable Integer loanId) 
	{
		Optional<LoanDetails> loanObj = loandetService.loanDetails(loanId);
		if(loanObj.isPresent())
		{
			return new ResponseEntity(loanObj, HttpStatus.OK);
		}
		else
		{
			throw new LoanNotFoundException("Loan not found");
		}
	}

}
