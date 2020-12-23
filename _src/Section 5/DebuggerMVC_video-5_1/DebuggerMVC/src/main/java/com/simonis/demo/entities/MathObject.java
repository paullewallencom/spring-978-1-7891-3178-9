//video-5_1_start
package com.simonis.demo.entities;

import org.springframework.stereotype.Component;

@Component
public class MathObject {
	
	private int valueA;
	private int valueB;
	
	public MathObject() {
		valueA=0;
		valueB=0;
	}
	
	public MathObject(int a, int b)
	{
		valueA=a;
		valueB=b;
	}
	
	public int getValueA() {
		return valueA;
	}
	public void setValueA(int valueA) {
		this.valueA = valueA;
	}
	public int getValueB() {
		return valueB;
	}
	public void setValueB(int valueB) {
		this.valueB = valueB;
	}
}
//video-5_1_end