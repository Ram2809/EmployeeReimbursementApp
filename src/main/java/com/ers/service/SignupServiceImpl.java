package com.ers.service;

import com.ers.dao.LoginCredentialsDAO;
import com.ers.dao.LoginCredentialsDAOImpl;
import com.ers.dao.SignupDAO;
import com.ers.dao.SignupDAOImpl;
import com.ers.model.Signup;

public class SignupServiceImpl implements SignupService {
	SignupDAO signupDAOImpl = new SignupDAOImpl();

	public boolean addEmployeeDetails(Signup signup) {
		return signupDAOImpl.addEmployeeDetails(signup);
	}
}
