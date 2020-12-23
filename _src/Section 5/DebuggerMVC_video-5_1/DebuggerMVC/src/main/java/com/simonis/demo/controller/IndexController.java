//video-5_1_start
package com.simonis.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simonis.demo.entities.MathObject;
import com.simonis.demo.services.MathService;

@Controller
public class IndexController {
	
	MathService mathservice ;
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("mathobject", new MathObject());
		
		return "index";
	}
	
	@PostMapping("/")
	public String doCalculation(@ModelAttribute("mathobject") MathObject mathobject, 
			@RequestParam("action") String action, Model model)
	{
		mathservice = new MathService(mathobject);
		
		if (action.equals("product"))
		{
			int product = mathservice.getProduct();
			
			model.addAttribute("product", product);
		}
		else if (action.equals("divide"))
		{
			float division= mathservice.getDivision();
			model.addAttribute("division", division);
		}
		

		return "index";
	}
}
//video-5_1_end