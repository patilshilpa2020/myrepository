package com.cjc.homeloan.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloan.app.model.LoanDisbursementDetails;
import com.cjc.homeloan.app.repository.LoanDisbursementDetailsRepository;
import com.cjc.homeloan.app.servicedec.LoanDisbursementDetailsDec;

@Service
public class LoanDisbursementDetailsImpl implements LoanDisbursementDetailsDec{
	
	@Autowired
	LoanDisbursementDetailsRepository loanDisburseRepo;

	@Override
	public String saveLoanDisbursementDetails(LoanDisbursementDetails loanDisburse) {
		
		if(loanDisburseRepo.save(loanDisburse)!=null) 
		{
			return "success";
		}
		else
		{
			return "fail";
		}
		
	}

	@Override
	public List<LoanDisbursementDetails> viewLoanDisbursementDetails() {
		
		return loanDisburseRepo.findAll();
	}

	@Override
	public LoanDisbursementDetails loanDisbursementDetails(Integer disburseId) {
		Optional<LoanDisbursementDetails> optionalLoanDisbursementDetails = loanDisburseRepo.findById(disburseId);
		return optionalLoanDisbursementDetails.get();
	}

}
