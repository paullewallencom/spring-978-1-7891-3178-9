//video_4_2_start
package com.simonis.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DebuggerDemoApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(DebuggerDemoApplication.class, args);
		
		MathDemo mathdemo= new MathDemo(5,3);
		int result = mathdemo.getProduct();
		float fresult = mathdemo.getDivision();
		int loops = mathdemo.doLoops(100);
		System.out.println("result: " + result);
		System.out.println("fresult:" + fresult);
		System.out.println("doloops:" + loops);
	}

}
//video-4_2_end
