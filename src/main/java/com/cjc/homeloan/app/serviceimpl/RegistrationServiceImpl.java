package com.cjc.homeloan.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloan.app.model.CustomerRegistration;
import com.cjc.homeloan.app.repository.RegistrationRepository;
import com.cjc.homeloan.app.servicedec.RegistrationServiceDec;

@Service
public class RegistrationServiceImpl implements RegistrationServiceDec{
	@Autowired
	private RegistrationRepository regRepo;
	
	@Override
	public CustomerRegistration saveReg(CustomerRegistration cr) {
		if(regRepo.save(cr)!=null) 
		{
			return cr;
		}
		else
		{	
		return null;
		}
	}

	@Override
	public List<CustomerRegistration> viewCustomerRegistration() {
		// TODO Auto-generated method stub
		return regRepo.findAll();
	}

	@Override
	public Optional<CustomerRegistration> CustomerRegistrationDetails(Integer custId) {
		Optional<CustomerRegistration> optionalReg = regRepo.findById(custId);
		return optionalReg;
	}

//	@Override
//	public List<CustDoc> savedoc(CustDoc d) {
//		regRepo.save(d);
//		List<CustDoc> l1=(List<CustDoc>) regRepo.findAll();
//			return l1;
//	}

}
