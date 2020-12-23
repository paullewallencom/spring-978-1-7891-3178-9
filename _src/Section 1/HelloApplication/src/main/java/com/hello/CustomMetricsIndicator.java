//video-1_4_code_start
package com.hello;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@Controller
class WebEndpoint {
	
	private final CustomMetricsIndicator customMetrics;
	
	public WebEndpoint(CustomMetricsIndicator metrics)
	{
		this.customMetrics = metrics;
	}
	
	@GetMapping("/callCustomMetrics")
	@ResponseBody
	public String dothecall()
	{
		this.customMetrics.counted();
		return "Done";
	}
}

@Service
public class CustomMetricsIndicator {

	private final Counter counter;
	
	public CustomMetricsIndicator(MeterRegistry registry)
	{
		this.counter = Counter.builder("customMetricsCounter")
				.description("a custom metrics")
				.register(registry);
	}
	
	public void counted()
	{
		this.counter.increment();
	}
}

//video-1_4_code_end