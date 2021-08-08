package com.ers.service;

import com.ers.dao.SignupDAO;
import com.ers.dao.SignupDAOImpl;
import com.ers.model.Signup;

public class SignupServiceImpl implements SignupService{
	SignupDAO signUpDAOImpl=(SignupDAO) new SignupDAOImpl();
	public void addEmployeeDetails(Signup signup)
	{
		signUpDAOImpl.addEmployeeDetails(signup);
	}
}
