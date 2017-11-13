package com.example.Authapplication.DAO;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Authapplication.entities.UserAuth;

@Repository
public interface UserAuthDao extends JpaRepository<UserAuth, UUID> {
	
	public UserAuth findByUserEmail(String email);
}
