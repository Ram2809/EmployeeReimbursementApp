package com.ers.service;

import com.ers.dao.LoginCredentialsDAO;
import com.ers.dao.LoginCredentialsDAOImpl;
import com.ers.model.LoginCredentials;

public class LoginCredentialsServiceImpl implements LoginCredentialsService{
	LoginCredentialsDAO loginCredentialsDAOImpl=(LoginCredentialsDAO) new LoginCredentialsDAOImpl();
	public void addLoginCredentials(LoginCredentials loginCredentials) {
		// TODO Auto-generated method stub
		loginCredentialsDAOImpl.addLoginCredentials(loginCredentials);
	}

}
