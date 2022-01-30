package com.cjc.homeloan.app.exception;

public class LoanNotFoundException extends RuntimeException {
	public LoanNotFoundException(String msg)
	{
		super(msg);
	}

}
