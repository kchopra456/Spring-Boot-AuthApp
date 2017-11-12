package com.example.Authapplication.service;

import com.example.Authapplication.entities.UserAuth;
import com.example.Authapplication.entities.UserRegisterEntity;;

public interface UserAuthService {
	
	public UserAuth findByEmail(String email);
	
	public String createUser(UserRegisterEntity user);
}
