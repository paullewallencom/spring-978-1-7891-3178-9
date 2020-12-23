//video-1_3_code_start
package com.hello;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CustomInfoContributor implements InfoContributor {

	@Autowired
	private ApplicationContext ctx;
	
	@Override
	public void contribute(Builder builder) {
		HashMap<String, Object> info = new HashMap();
		info.put("bean-definition-count", ctx.getBeanDefinitionCount());
		info.put("startup-date", ctx.getStartupDate());
		builder.withDetail("context", info);
	}

}
//video-1_3_code_end