package com.gurubelli.surya;

import com.gurubelli.surya.health.TemplateHealthCheck;
import com.gurubelli.surya.resources.HelloWorldResource;

import io.dropwizard.Application;
import io.dropwizard.java8.Java8Bundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloworldApplication extends Application<HelloWorldConfiguration>{
	
	public static void main(String [] args) throws Exception {
	   new HelloworldApplication().run(args);	
	}

	@Override
	public String getName() {
		return "hello-world";
	}
	
	/**
	 * initialization method is used to configure aspects of the application required before the application is run
	 */
	@Override
	public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
		
		//Nothing initialized yet
	   bootstrap.addBundle(new Java8Bundle());
		
	}
	@Override
	public void run(HelloWorldConfiguration configuration, Environment environment) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("Hello world");
		final HelloWorldResource resource = new HelloWorldResource(configuration.getTemplate(), configuration.getDefaultName());
		
		//Register health check
		final TemplateHealthCheck check = new TemplateHealthCheck(configuration.getTemplate());
		
		environment.healthChecks().register("template", check);
		environment.jersey().register(resource);
		
	}

}
