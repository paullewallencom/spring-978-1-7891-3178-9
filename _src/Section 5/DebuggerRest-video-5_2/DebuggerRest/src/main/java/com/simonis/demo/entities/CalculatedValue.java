//video-5_2_start
package com.simonis.demo.entities;



public class CalculatedValue {
	private String operation;
	private Object value;
	
	public CalculatedValue(String operation, Object value)
	{
		this.operation=operation;
		this.value=value;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
//video-5_2_end