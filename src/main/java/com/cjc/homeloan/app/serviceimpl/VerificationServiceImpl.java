package com.cjc.homeloan.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloan.app.model.Verification;
import com.cjc.homeloan.app.repository.VerificationRepository;
import com.cjc.homeloan.app.servicedec.VerificationServiceDec;

@Service
public class VerificationServiceImpl implements VerificationServiceDec {

	@Autowired
	VerificationRepository verRepo;
	
	@Override
	public String saveVerification(Verification verification) {
		if(verRepo.save(verification)!=null) 
		{
			return "success";
		}
		else
		{
			return "fail";
		}
		
	}

	@Override
	public List<Verification> viewVerification() {
		// TODO Auto-generated method stub
		return verRepo.findAll();
	}

	@Override
	public Verification verificationDetails(Integer verId) {
		Optional<Verification> optionalverDetails = verRepo.findById(verId);
		return optionalverDetails.get();
	}
	



}
