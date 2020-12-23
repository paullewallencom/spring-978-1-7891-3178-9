// video-1_1_code_start
package com.hello;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class HelloController {

//video-1_5_code_start	
private static Log log = LogFactory.getLog(HelloController.class);
//video-1_5_code_end	
	
	@GetMapping("/")
	public String getIndex()
	{
		//video-1_5_code_start	
		log.debug("index debug");
		log.info("index info");
		//video-1_5_code_end
		return "index";
	}
}
//video-1_1_code_end