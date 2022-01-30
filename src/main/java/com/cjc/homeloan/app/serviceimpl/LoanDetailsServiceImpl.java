package com.cjc.homeloan.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cjc.homeloan.app.model.LoanDetails;
import com.cjc.homeloan.app.repository.LoanDetailsRepository;
import com.cjc.homeloan.app.servicedec.LoanDetailsServiceDec;

@Service
public class LoanDetailsServiceImpl implements LoanDetailsServiceDec
{
	@Autowired
	LoanDetailsRepository loanRepo;

	@Override
	public String saveEnqiry(LoanDetails loan) {
		if(loanRepo.save(loan)!=null) 
		{
			return " Data saves successfully";
		}
		else
		{	
		return "failed";
		}
	}

	@Override
	public List<LoanDetails> viewLoanDetails() {
		// TODO Auto-generated method stub
		return loanRepo.findAll();
	}

	@Override
	public Optional<LoanDetails> loanDetails(Integer loanId) {
		Optional<LoanDetails> optionalLoan = loanRepo.findById(loanId);
		return optionalLoan;
	}
	

}
