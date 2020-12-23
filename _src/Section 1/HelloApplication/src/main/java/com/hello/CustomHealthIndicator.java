//video-1_3_code_start
package com.hello;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

	@Override
	public Health health()
	{
		LocalDate today = LocalDate.now();
		if (today.getDayOfWeek()==DayOfWeek.SUNDAY)
			return Health.outOfService().withDetail("outOfServiceOn", today.getDayOfWeek()).build();
		return Health.up().build();
	}
}
//video-1_3_code_end