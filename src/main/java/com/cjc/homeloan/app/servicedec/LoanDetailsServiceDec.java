package com.cjc.homeloan.app.servicedec;

import java.util.List;
import java.util.Optional;

import com.cjc.homeloan.app.model.LoanDetails;

public interface LoanDetailsServiceDec {

	String saveEnqiry(LoanDetails loan);

	List<LoanDetails> viewLoanDetails();

	Optional<LoanDetails> loanDetails(Integer custId);

}
