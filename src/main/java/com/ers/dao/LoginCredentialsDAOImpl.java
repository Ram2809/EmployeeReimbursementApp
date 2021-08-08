package com.ers.dao;

import org.hibernate.Session;

import com.ers.model.LoginCredentials;
import com.ers.util.HibernateUtil;

public class LoginCredentialsDAOImpl implements LoginCredentialsDAO {
	public void addLoginCredentials(LoginCredentials loginCredentials) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save
		}
	}

}
