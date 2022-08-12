package com.spring.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.service.RestapiService;

@RestController
public class RestapiController {
	
	//@Autowired
	//private RestapiService restapi;
	
	@PostMapping("/method")
	public String getName(String name)
	{
		return name.toUpperCase();
	}
	
	//@GetMapping("/users")
	//public String getSakshi()
	//{
		//return "Sakshi";
	//}
}
