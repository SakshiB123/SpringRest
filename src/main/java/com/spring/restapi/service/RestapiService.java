package com.spring.restapi.service;

import org.springframework.stereotype.Service;

@Service
public class RestapiService {
	
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
