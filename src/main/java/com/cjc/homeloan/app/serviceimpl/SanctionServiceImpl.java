package com.cjc.homeloan.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloan.app.model.Sanction;
import com.cjc.homeloan.app.repository.SanctionRepository;
import com.cjc.homeloan.app.servicedec.SactionServiceDec;

@Service
public class SanctionServiceImpl implements SactionServiceDec {

	@Autowired
	SanctionRepository sanctionrepo;

	@Override
	public Sanction saveSanction(Sanction sanction) {
		if (sanctionrepo.save(sanction) != null) {
			return sanction;
		} else {
			return null;
		}
	}

	@Override
	public List<Sanction> viewSanctions() {

		return sanctionrepo.findAll();
	}

}
