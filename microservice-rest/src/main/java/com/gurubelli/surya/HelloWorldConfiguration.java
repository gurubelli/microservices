package com.gurubelli.surya;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;
/**
 * The mapping from YAML file to Configuration is done by Jackson 
 * @author srinivas
 *
 */
public class HelloWorldConfiguration extends Configuration {

	//The matching getters and setters from YAML file
	//For our example, let's say template --> Freemaker and default name if not speified 
	
	@NotEmpty
	private String template;
	
	@NotEmpty
	private String defaultName = "Stranger";
	
	//Annotated with JsonPropery which allows jackson to deserialize it
	@JsonProperty
	public String getTemplate() {
		return template;
	}
	
	//Annotated with JsonProperty which allows jackson to serialize it
	@JsonProperty
	public void setTemplate(final String template) {
		this.template = template;
	}
	
	@JsonProperty
	public String getDefaultName() {
		return defaultName;
		
	}
	
	@JsonProperty
	public void setDefaultName(final String defaultName) {
		this.defaultName = defaultName;
	}
}
