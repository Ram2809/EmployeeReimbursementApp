package com.ers.service;

import java.util.List;

import com.ers.entity.LoginCredentialsEntity;
import com.ers.entity.LoginEntity;
import com.ers.model.Login;

public interface LoginService {
	public List<LoginCredentialsEntity> validateUser();

	public boolean updateForgotPassword(String userName, String passWord);
}
