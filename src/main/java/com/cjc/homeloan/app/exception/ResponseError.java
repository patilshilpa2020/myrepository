package com.cjc.homeloan.app.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseError
{
	private Date timestamp;
	private int statuscode;
	private String errormsg;
	private HttpStatus error;
	private String path;
}