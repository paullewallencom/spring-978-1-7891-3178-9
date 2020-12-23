//video-5_2_start
package com.simonis.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simonis.demo.entities.CalculatedValue;
import com.simonis.demo.exceptions.DivisorNotNullException;

@RestController
public class IndexController {

	@GetMapping(path="/product")
	
	public CalculatedValue getProduct(@RequestParam("valueA") int valA, 
			@RequestParam("valueB")int valB )
	{
		int res = valA * valB;
		CalculatedValue result = new CalculatedValue("product", res);
		
		return result;
	}
	
	@GetMapping("/divide")
	public CalculatedValue getDivision(@RequestParam("valueA") int valA, 
			@RequestParam("valueB") int valB)
	{
		if (valB==0) 
			throw new DivisorNotNullException("Division by 0 forbidden!");
		float res = (float)valA/valB;
		CalculatedValue result = new CalculatedValue("division", res);
		return result;
	}
}
//video-5_2_end