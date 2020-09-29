package com.gurubelli.surya.health;

import com.codahale.metrics.health.HealthCheck;

public class TemplateHealthCheck extends HealthCheck {
	
	private final String template;
	
	public TemplateHealthCheck(final String template) {
		this.template = template;
	}

	@Override
	protected Result check() throws Exception {
		// TODO Auto-generated method stub
		final String saying = String.format("Hello1 %s", "TEST"); 
		System.out.println("Formatted string" + saying);
		if(!saying.contains("TEST")) {
			return Result.unhealthy("Template does not include a name"); 
			
		}
		return Result.healthy();
	}
	
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		final String saying = String.format("Hello %s", "TEST"); 
		System.out.println("Formatted string " + saying);
	}

}
