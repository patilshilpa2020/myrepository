package com.cjc.homeloan.app.servicedec;

import java.util.List;
import java.util.Optional;


import com.cjc.homeloan.app.model.CustomerRegistration;

public interface RegistrationServiceDec {
	public CustomerRegistration saveReg(CustomerRegistration cr);

	public List<CustomerRegistration> viewCustomerRegistration();

	public Optional<CustomerRegistration> CustomerRegistrationDetails(Integer custId);

//	public List<CustDoc> savedoc(CustDoc d);
}
