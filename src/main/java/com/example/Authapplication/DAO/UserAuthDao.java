package com.example.Authapplication.DAO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Authapplication.entities.UserAuth;

@Repository
public interface UserAuthDao extends JpaRepository<UserAuth, String> {
	
	public UserAuth findByUserEmail(String email);
}
