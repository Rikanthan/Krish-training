package com.example.microservices.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@RestController
public class MainController {

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String welcome()
	{
		return "welcome to rent";
	}
	
	@RequestMapping(value = "/hello",method = RequestMethod.POST)
	public String welcom()
	{
		return "welcome to rent car";
	}
}
