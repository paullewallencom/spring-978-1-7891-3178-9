//video-5_1_start
package com.simonis.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simonis.demo.entities.MathObject;
import com.simonis.demo.exceptions.DivisorNotNullException;

@Service
public class MathService {
	
		@Autowired
		MathObject mobject;
		
		@Autowired
		public MathService(MathObject object)
		{
			mobject = object;
		}
	
		public int getProduct()
		{
			return mobject.getValueA()*mobject.getValueB();
		}
		
		public float getDivision() throws DivisorNotNullException
		{
			if (mobject.getValueB()==0)
				throw new DivisorNotNullException("Division by null not allowed!");
			return (float) mobject.getValueA()/mobject.getValueB();
		}
}
//video-5_1_end