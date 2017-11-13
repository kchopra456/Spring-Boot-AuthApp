package com.example.Authapplication.service;

import java.util.UUID;

import com.example.Authapplication.entities.UserEntity;
import com.example.Authapplication.entities.UserRegisterEntity;

public interface UserDetailsEntityService {

	public UserEntity findById(UUID id);
	
	public String createUser(UserRegisterEntity user, UUID id);
	
	 UserEntity setUserDetails(UserRegisterEntity user, UUID id);

}
