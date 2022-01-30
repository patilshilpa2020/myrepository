package com.cjc.homeloan.app.servicedec;

import java.util.List;

import com.cjc.homeloan.app.model.Verification;

public interface VerificationServiceDec {

	String saveVerification(Verification verification);

	List<Verification> viewVerification();

	Verification verificationDetails(Integer verId);

}
