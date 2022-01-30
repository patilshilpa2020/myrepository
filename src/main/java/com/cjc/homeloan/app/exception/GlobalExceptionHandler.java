package com.cjc.homeloan.app.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ResponseError> CustomerNotFoundExceptionHandler(CustomerNotFoundException ex,HttpServletRequest request)

	{
		ResponseError error=new ResponseError(new Date(),HttpStatus.NOT_FOUND.value(),ex.getMessage(),HttpStatus.NOT_FOUND,request.getRequestURI());
		
		return new ResponseEntity<ResponseError>(error,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(CustomerExistsException.class)
	public ResponseEntity<ResponseError> CustomerExistsExceptionHandler(CustomerExistsException ex,HttpServletRequest request)

	{
		ResponseError error=new ResponseError(new Date(),HttpStatus.NOT_FOUND.value(),ex.getMessage(),HttpStatus.NOT_FOUND,request.getRequestURI());
		
		return new ResponseEntity<ResponseError>(error,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(LoanNotFoundException.class)
	public ResponseEntity<ResponseError> LoanNotFoundExceptionHandler(LoanNotFoundException ex,HttpServletRequest request)

	{
		ResponseError error=new ResponseError(new Date(),HttpStatus.NOT_FOUND.value(),ex.getMessage(),HttpStatus.NOT_FOUND,request.getRequestURI());
		
		return new ResponseEntity<ResponseError>(error,HttpStatus.NOT_FOUND);
		
	}
}
