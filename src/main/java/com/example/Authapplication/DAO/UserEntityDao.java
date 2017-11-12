package com.example.Authapplication.DAO;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Authapplication.entities.UserEntity;

public interface UserEntityDao extends JpaRepository<UserEntity, UUID> {

	public UserEntity findByUserId(UUID id);
}
