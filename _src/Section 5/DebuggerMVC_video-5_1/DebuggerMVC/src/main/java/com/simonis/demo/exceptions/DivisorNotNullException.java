//video-5_1_start
package com.simonis.demo.exceptions;

public class DivisorNotNullException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DivisorNotNullException(String msg)
	{
		super(msg);
	}
}
//video-5_1_end