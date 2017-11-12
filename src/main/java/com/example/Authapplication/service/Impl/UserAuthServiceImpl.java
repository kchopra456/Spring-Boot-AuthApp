package com.example.Authapplication.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Authapplication.DAO.UserAuthDao;
import com.example.Authapplication.entities.UserAuth;
import com.example.Authapplication.entities.UserRegisterEntity;
import com.example.Authapplication.service.UserAuthService;

@Service
class UserAuthServiceImpl implements UserAuthService {

	@Autowired
	UserAuthDao userAuthDao;
	@Override
	public UserAuth findByEmail(String email) {
		
		return userAuthDao.findByUserEmail(email);
	}
	@Override
	public String createUser(UserRegisterEntity user) {

		UserAuth userAuth = new UserAuth();
		userAuth.setUserEmail(user.getEmail());
		
		return null;
	}
	
	

}
