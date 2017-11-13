package com.example.Authapplication.service.Impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Authapplication.DAO.UserAuthDao;
import com.example.Authapplication.entities.UserAuth;
import com.example.Authapplication.entities.UserRegisterEntity;
import com.example.Authapplication.service.UserAuthService;

@Service("UserAuthService")
public class UserAuthServiceImpl implements UserAuthService {

	@Autowired
	UserAuthDao userAuthDao;
	
	@Override
	public UserAuth findByEmail(String email) {
		return userAuthDao.findByUserEmail(email);	
		}

	@Override
	public UUID createUser(UserRegisterEntity user) {
		UserAuth userAuth = new UserAuth();
		userAuth.setUserEmail(user.getEmail());
		userAuth.setUserPassword(user.getPassword());
		
		userAuthDao.save(userAuth);
		return userAuth.getUserId();
	}

}
