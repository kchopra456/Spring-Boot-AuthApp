package com.example.Authapplication.service;

import java.util.UUID;

import com.example.Authapplication.entities.UserAuth;
import com.example.Authapplication.entities.UserRegisterEntity;;

public interface UserAuthService {
	
	public UserAuth findByEmail(String email);
	
	public UUID createUser(UserRegisterEntity user);
}
