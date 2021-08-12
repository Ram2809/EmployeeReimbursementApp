package com.ers.dao;

import java.util.List;

import com.ers.entity.SignupEntity;
import com.ers.model.Signup;

public interface SignupDAO {
	public boolean addEmployeeDetails(Signup signup);
	public List<SignupEntity> getEmployeeDetails(String userName);
	public boolean updateEmployeeDetails(Signup signup);
}
