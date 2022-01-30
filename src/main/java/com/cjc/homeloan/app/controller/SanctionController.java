package com.cjc.homeloan.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.homeloan.app.model.Sanction;
import com.cjc.homeloan.app.servicedec.SactionServiceDec;

@RestController
public class SanctionController {
	
	@Autowired
	SactionServiceDec sanctionservice;
	
	@PostMapping("/saveSanction")
	public ResponseEntity<Sanction> saveSanction(@RequestBody Sanction sanction) 
	{
		Sanction sanctionobj = sanctionservice.saveSanction(sanction);
		return new ResponseEntity<Sanction>(sanctionobj, HttpStatus.CREATED);
	}
	
	@GetMapping("/viewSanctions")
	public  ResponseEntity<List<Sanction>> viewSanctions()
	{
		List<Sanction> sanctionList = sanctionservice.viewSanctions();
		return new ResponseEntity<List<Sanction>>(sanctionList, HttpStatus.OK);
	}
	

}
