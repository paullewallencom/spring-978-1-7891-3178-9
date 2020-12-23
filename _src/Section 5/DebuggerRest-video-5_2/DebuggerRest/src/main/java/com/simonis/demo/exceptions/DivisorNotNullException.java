//video-5_2_start
package com.simonis.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivisorNotNullException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DivisorNotNullException(String msg)
	{
		super(msg);
	}
}
//video-5_2_end