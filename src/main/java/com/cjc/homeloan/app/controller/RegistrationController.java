package com.cjc.homeloan.app.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloan.app.exception.CustomerExistsException;
import com.cjc.homeloan.app.exception.CustomerNotFoundException;
import com.cjc.homeloan.app.model.CustDoc;
import com.cjc.homeloan.app.model.CustomerRegistration;
import com.cjc.homeloan.app.model.Enquiry;
import com.cjc.homeloan.app.servicedec.RegistrationServiceDec;
import com.google.gson.Gson;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationServiceDec regService;

//	@PostMapping("/saveApplication")
//	public ResponseEntity<CustomerRegistration> saveReg(@RequestBody CustomerRegistration cr) {
//		CustomerRegistration regObj = regService.saveReg(cr);
//		return new ResponseEntity<CustomerRegistration>(regObj, HttpStatus.CREATED);
//	}

	@RequestMapping(value = "/saveApplication", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)

	public ResponseEntity<CustomerRegistration> saveReg(@RequestPart CustomerRegistration cr,
			@RequestPart(required = true, value = "addressProof") MultipartFile files1,
			@RequestPart(required = true, value = "bankStatement") MultipartFile files2,
			@RequestPart(required = true, value = "itr") MultipartFile files3,
			@RequestPart(required = true, value = "photo") MultipartFile files4,
			@RequestPart(required = true, value = "blankCheck") MultipartFile files5,
			@RequestPart(required = true, value = "thumb") MultipartFile files6,
			@RequestPart(required = true, value = "salarySlip") MultipartFile files7,
			@RequestPart(required = true, value = "signature") MultipartFile files8,
			@RequestPart(required = true, value = "aadharCard") MultipartFile files9,
			@RequestPart(required = true, value = "panCard") MultipartFile files10,
			@RequestPart("doc") String doc)
			throws IOException {

		CustDoc custDocObj = new CustDoc();
		custDocObj.setAddressProof(files1.getBytes());
		custDocObj.setBankStatement(files2.getBytes());
		custDocObj.setItr(files3.getBytes());
		custDocObj.setPhoto(files4.getBytes());
		custDocObj.setBlankCheck(files5.getBytes());
		custDocObj.setThumb(files6.getBytes());
		custDocObj.setSalarySlip(files7.getBytes());
		custDocObj.setSignature(files8.getBytes());
		custDocObj.setAadharCard(files9.getBytes());
		custDocObj.setPanCard(files10.getBytes());

		Gson gson = new Gson();
//		CustomerRegistration cr=new CustomerRegistration();
		CustDoc custDocObj1 = gson.fromJson(doc, CustDoc.class);
//		custDocObj.setCustomerId(custDocObj1.getCustomerId());
		cr.setCustdoc(custDocObj);
		CustomerRegistration regObj = regService.saveReg(cr);
//		regObj.setCustdoc(custDocObj1);
//		if(cr.getCustEmail().equalsIgnoreCase(regObj.getCustEmail()))
//		{
//			throw new CustomerExistsException("customer already exists");
//		}
//		else
//		{
		return new ResponseEntity<CustomerRegistration>(regObj, HttpStatus.CREATED);
//		}
	}
	
	@GetMapping("/viewCustomerRegistration")
	public  ResponseEntity<List<CustomerRegistration>> viewCustomerRegistration() {
		List<CustomerRegistration> customerRegistrationList = regService.viewCustomerRegistration();
		return new ResponseEntity<List<CustomerRegistration>>(customerRegistrationList, HttpStatus.OK);
	}
	
	@GetMapping("/customerRegistrationDetails/{custId}")
	public  ResponseEntity<CustomerRegistration> CustomerRegistrationDetails(@PathVariable Integer custId) {
		Optional<CustomerRegistration> customerRegistrationObj = regService.CustomerRegistrationDetails(custId);
//		if(customerRegistrationObj.isPresent())
//		{
		return new ResponseEntity(customerRegistrationObj, HttpStatus.OK);
//		}
//		else
//		{
//			throw new CustomerNotFoundException("Customer not found");
//		}
	}
	
}
