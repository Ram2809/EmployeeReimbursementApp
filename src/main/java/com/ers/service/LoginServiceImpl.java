package com.ers.service;

import java.util.List;

import com.ers.dao.LoginDAO;
import com.ers.dao.LoginDAOImpl;
import com.ers.entity.LoginCredentialsEntity;
import com.ers.entity.LoginEntity;
import com.ers.model.Login;

public class LoginServiceImpl implements LoginService {
	LoginDAO loginDAOImpl = (LoginDAO) new LoginDAOImpl();

	public List<LoginCredentialsEntity> validateUser() {
		return loginDAOImpl.validateUser();
	}

}
