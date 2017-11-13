package com.example.Authapplication.service.Impl;

import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Authapplication.DAO.UserEntityDao;
import com.example.Authapplication.entities.UserEntity;
import com.example.Authapplication.entities.UserRegisterEntity;
import com.example.Authapplication.service.UserDetailsEntityService;

@Service
public class UserDetailsEntityServiceImpl implements UserDetailsEntityService {

	@Autowired
	private UserEntityDao userEntityDao;

	@Override
	public UserEntity findById(UUID id) {

		return userEntityDao.findByUserId(id);
	}

	@Override
	public String createUser(UserRegisterEntity user, UUID id) {
		
		UserEntity userEntity = setUserDetails(user, id);
		
		userEntityDao.save(userEntity);
		return null;
	}

	@Override
	public UserEntity setUserDetails(UserRegisterEntity user, UUID id) {
		
		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setTimeCreated(new Timestamp(System.currentTimeMillis()));
		userEntity.setUserId(id);
		userEntity.setLastVisit(userEntity.getTimeCreated());
		return userEntity;
	}



	

}
