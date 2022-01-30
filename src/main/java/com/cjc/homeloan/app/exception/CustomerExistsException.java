package com.cjc.homeloan.app.exception;

public class CustomerExistsException extends RuntimeException{

	public CustomerExistsException(String msg) {
		super(msg);
	}

}
