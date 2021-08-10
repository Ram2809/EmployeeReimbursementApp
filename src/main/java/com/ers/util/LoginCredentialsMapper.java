package com.ers.util;

import com.ers.entity.LoginCredentialsEntity;
import com.ers.entity.SignupEntity;
import com.ers.model.LoginCredentials;

public class LoginCredentialsMapper {
	public static LoginCredentialsEntity mapLoginCredentials(LoginCredentials loginCredentials) {
		System.out.println("IN Start LOGIN MAPPER");
		LoginCredentialsEntity loginCredentialsEntity = new LoginCredentialsEntity();
		SignupEntity signupEntity = new SignupEntity();
		signupEntity.setEmpId(loginCredentials.getEmpId());
		loginCredentialsEntity.setEmpId(signupEntity);
		loginCredentialsEntity.setUserName(loginCredentials.getUserName());
		loginCredentialsEntity.setPassWord(loginCredentials.getPassWord());
		System.out.println("IN end LOGIN MAPPER");
		return loginCredentialsEntity;

	}
}
