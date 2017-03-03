package com.gurubelli.surya.api;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Saying {

	/*
	 * { 
	 *   "id": 1,
	 *   "content": "Hi!
	 * 
	 * } 
	 */
	
	private long id;
	
	@Length(max = 3)
	private String content;
	
	public Saying() {
		//Deserialize
	}
	
	public Saying(final long id, final String content) {
		this.id = id;
		this.content = content;
	}
	
	@JsonProperty
	public long getId() {
		return this.id;
	}
	
	@JsonProperty
	public String getContent() {
		return this.content;
	}
}
