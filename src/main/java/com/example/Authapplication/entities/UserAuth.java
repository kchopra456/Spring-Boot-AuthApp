package com.example.Authapplication.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "UserAuth")
public class UserAuth {

	@Id
	@Column(name = "user_id")
	private UUID userId = UUID.randomUUID();
	
	@Column(name = "user_email")
	private String userEmail;
	
	@Column(name = "user_password")
	private String userPassword;

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public UUID getUserId() {
		return userId;
	}

	@Override
	public String toString() {
		return "UserAuth [userId=" + userId + ", userEmail=" + userEmail + ", userPassword=" + userPassword + "]";
	}

}
