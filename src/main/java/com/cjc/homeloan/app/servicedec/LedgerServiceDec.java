package com.cjc.homeloan.app.servicedec;

import java.util.List;

import com.cjc.homeloan.app.model.Ledger;

public interface LedgerServiceDec {

	public String saveledger(Ledger ledger);

	public List<Ledger> viewLedger();

	public Ledger ledgerDetails(Integer ledId);

}
