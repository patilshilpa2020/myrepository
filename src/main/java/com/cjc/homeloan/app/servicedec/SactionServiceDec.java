package com.cjc.homeloan.app.servicedec;

import java.util.List;

import com.cjc.homeloan.app.model.Sanction;

public interface SactionServiceDec {

	Sanction saveSanction(Sanction sanction);

	List<Sanction> viewSanctions();

}
