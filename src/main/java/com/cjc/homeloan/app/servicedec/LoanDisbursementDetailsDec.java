package com.cjc.homeloan.app.servicedec;

import java.util.List;

import com.cjc.homeloan.app.model.LoanDisbursementDetails;

public interface LoanDisbursementDetailsDec {

	public String saveLoanDisbursementDetails(LoanDisbursementDetails loanDisburse);

	public List<LoanDisbursementDetails> viewLoanDisbursementDetails();

	public LoanDisbursementDetails loanDisbursementDetails(Integer disburseId);

}
