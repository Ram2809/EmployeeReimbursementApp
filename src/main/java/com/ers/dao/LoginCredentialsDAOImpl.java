package com.ers.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.ers.entity.LoginCredentialsEntity;
import com.ers.entity.SignupEntity;
import com.ers.model.LoginCredentials;
import com.ers.model.Signup;
import com.ers.util.HibernateUtil;
import com.ers.util.LoginCredentialsMapper;
import com.ers.util.SignupMapper;

public class LoginCredentialsDAOImpl implements LoginCredentialsDAO {
	public void addLoginCredentials(LoginCredentials loginCredentials) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			System.out.println("In login dao impl");
			session.beginTransaction();
			System.out.println("after mapper");
			session.save(LoginCredentialsMapper
					.mapLoginCredentials(loginCredentials));
			session.getTransaction().commit();
			System.out.println("Data inserted successfully!");
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	

}
