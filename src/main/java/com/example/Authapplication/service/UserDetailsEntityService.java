package com.example.Authapplication.service;

import java.util.UUID;

import com.example.Authapplication.entities.UserEntity;

public interface UserDetailsEntityService {

	public UserEntity findById(UUID id);
}
