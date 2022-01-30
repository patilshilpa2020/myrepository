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


import com.cjc.homeloan.app.model.Verification;
import com.cjc.homeloan.app.servicedec.VerificationServiceDec;

@RestController
public class VerificationController {
	@Autowired
	VerificationServiceDec verDec;
	
	@PostMapping("/saveVerification")
	public ResponseEntity<String> saveVerification(@RequestBody Verification verification){
		verDec.saveVerification(verification);
		return new ResponseEntity<String>("Successfully verified", HttpStatus.CREATED);
	}
	
	
	@GetMapping("/viewVerification")
	public  ResponseEntity<List<Verification>> viewVerification() {
		List<Verification> verList = verDec.viewVerification();
		return new ResponseEntity<List<Verification>>(verList, HttpStatus.OK);
	}
	
	
	@GetMapping("/viewVerification/{verId}")
	public  ResponseEntity<Verification> VerificationDetails(@PathVariable Integer verId) {
		Verification verObj = verDec.verificationDetails(verId);
		return new ResponseEntity<Verification>(verObj, HttpStatus.OK);
	}

}
