package com.ers.dao;

import java.util.List;

import com.ers.entity.LoginCredentialsEntity;

public interface LoginDAO {
	public List<LoginCredentialsEntity> validateUser();
}