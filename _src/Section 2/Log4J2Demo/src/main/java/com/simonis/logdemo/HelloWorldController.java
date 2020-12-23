//video-2_1_code_start
package com.simonis.logdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	private static final Logger logger = LogManager.getLogger(HelloWorldController.class);
	// video-2_2_code_start
	private static final DemoExtendedLogger extendedLogger = DemoExtendedLogger.create(HelloWorldController.class);
	private static final DemoCustomLogger customLogger = DemoCustomLogger.create(HelloWorldController.class);
	// video-2_2_code_end
	@GetMapping("/")
	public String index()
	{
		logger.warn("this is a warning!");
		logger.info("this is an info");
		logger.debug("this is a debug");
		logger.trace("this is a trace");
		logger.error("We have an error!");
		logger.fatal("This is absolutely FATAL!");
		// video-2_2_code_start
		customLogger.diag("this is a custom diagnose");
		customLogger.verbose("this is a custom verbose");
		
		extendedLogger.diag("this is an extended diagnose");
		extendedLogger.verbose("this is an extended verbose");
		// video-2_2_code_end
		return "index";
	}
}
//video-2_1_code_end