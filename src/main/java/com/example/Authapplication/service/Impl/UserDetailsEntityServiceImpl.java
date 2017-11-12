package com.example.Authapplication.service.Impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Authapplication.DAO.UserEntityDao;
import com.example.Authapplication.entities.UserEntity;
import com.example.Authapplication.service.UserDetailsEntityService;

public class UserDetailsEntityServiceImpl implements UserDetailsEntityService {

	@Autowired
	private UserEntityDao userEntityDao;

	@Override
	public UserEntity findById(UUID id) {

		return userEntityDao.findByUserId(id);
	}

}
