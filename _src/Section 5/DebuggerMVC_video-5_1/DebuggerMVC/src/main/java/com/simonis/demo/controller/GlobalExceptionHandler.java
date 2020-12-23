//video-5_1_start
package com.simonis.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.simonis.demo.entities.MathObject;
import com.simonis.demo.exceptions.DivisorNotNullException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(DivisorNotNullException.class)
	public ModelAndView handleDivisionNotNull()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("mathobject", new MathObject());
		mav.addObject("exception", "Division by null not allowed!");
		mav.setViewName("index");
		return mav;
	}
}
// video-5_1_end