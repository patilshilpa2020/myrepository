package com.cjc.homeloan.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloan.app.model.Ledger;
import com.cjc.homeloan.app.repository.LedgerRepository;
import com.cjc.homeloan.app.servicedec.LedgerServiceDec;

@Service
public class LedgerServiceImpl implements LedgerServiceDec{
	
	@Autowired
	private LedgerRepository ledgerRepo;

	@Override
	public String saveledger(Ledger ledger) {
		if(ledgerRepo.save(ledger)!=null)  
		{
			return "success";
		}
		else
		{
			return "fail";
		}
	}

	@Override
	public List<Ledger> viewLedger() {
		
		return ledgerRepo.findAll();
	}

	@Override
	public Ledger ledgerDetails(Integer ledId) {
		Optional<Ledger> optionalLedger = ledgerRepo.findById(ledId);
		return optionalLedger.get();
	}

}
