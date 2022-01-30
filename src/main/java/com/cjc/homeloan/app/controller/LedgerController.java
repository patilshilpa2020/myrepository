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

import com.cjc.homeloan.app.model.Ledger;
import com.cjc.homeloan.app.servicedec.LedgerServiceDec;

@RestController
public class LedgerController {
	
	@Autowired
	private LedgerServiceDec ledgerService;
	
	
	@PostMapping("/saveLedger")
	public ResponseEntity<String> saveEnquiry(@RequestBody Ledger ledger) {
		ledgerService.saveledger(ledger);
		return new ResponseEntity<String>("Successful", HttpStatus.CREATED);
	}
	
	@GetMapping("/viewLedger")
	public  ResponseEntity<List<Ledger>> viewLedger() {
		List<Ledger> ledgerList = ledgerService.viewLedger();
		return new ResponseEntity<List<Ledger>>(ledgerList, HttpStatus.OK);
	}
	
	@GetMapping("/ledgerDetails/{ledId}")
	public  ResponseEntity<Ledger> enquiryDetails(@PathVariable Integer ledId) {
		Ledger ledgerObj = ledgerService.ledgerDetails(ledId);
		return new ResponseEntity<Ledger>(ledgerObj, HttpStatus.OK);
	}

}
