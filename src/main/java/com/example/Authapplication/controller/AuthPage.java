package com.example.Authapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AuthPage {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	 private static String greet() {
		return "Greetings User!";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	 private static ModelAndView  login() {
		ModelAndView model = new ModelAndView();
		model.setViewName("registration_page");
		return model;
	}
	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	 private static String  sample() {
		
		return "Sample";
	}
	
	@RequestMapping(value = "/user_registration", method = RequestMethod.POST)
	private static String registerUser(@RequestParam String firstName, @RequestParam String lastName, 
			@RequestParam String email, @RequestParam String password, @RequestParam String confirmPassword) {
		System.out.println( "received request-" + firstName);
		return "received request-" + firstName;
	}
	
	
}
