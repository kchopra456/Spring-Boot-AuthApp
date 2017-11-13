package com.example.Authapplication.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Authapplication.entities.UserAuth;
import com.example.Authapplication.entities.UserRegisterEntity;
import com.example.Authapplication.service.UserAuthService;
import com.example.Authapplication.service.Impl.UserAuthServiceImpl;
import com.example.Authapplication.service.Impl.UserDetailsEntityServiceImpl;

@RestController
public class AuthPage {
	
	@Autowired
	private UserAuthServiceImpl userAuthService;
	
	@Autowired
	private UserDetailsEntityServiceImpl userEntityService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	 private String greet() {
		return "Greetings User!";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	 private ModelAndView  login() {
		ModelAndView model = new ModelAndView();
		model.setViewName("registration_page");
		return model;
	}
	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	 private String  sample() {
		
		return "Sample";
	}
	
	//TODO Check that the user Details are correct
	@RequestMapping(value = "/user_registration", method = RequestMethod.POST)
	private String registerUser( UserRegisterEntity user) {		//TODO Ensure that the user details are not NUll
		
		System.out.println(userAuthService);
		UUID userId = userAuthService.createUser(user);
		userEntityService.createUser(user, userId);
		System.out.println( "received request-" + user.getFirstName());
		return "received request-1" + user.getFirstName();
	}
	
	
}
