//video-4_2_start
package com.simonis.demo;
/*
 * MathDemo for calculating and debugging purpose. 
 */

public class MathDemo {
	private int x;
	private int y;
	
	
	public MathDemo() {
		setX(0);
		setY(0);
	}
	
	public MathDemo(int x, int y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	public MathDemo(MathDemo old) {
		this.setX(old.getX());
		this.setY(old.getY());
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getProduct() {
		return x*y;
	}
	
	public float getDivision() {
		return (float)x/y;
	}
	
    public int doLoops(int max)
    {
    	int res = 0;
    	for (int i=0;i<max; i++)
    	{
    		res = x * y * i;
    	}
    	return res ;
    }
    
	
}
//video-4_2_end