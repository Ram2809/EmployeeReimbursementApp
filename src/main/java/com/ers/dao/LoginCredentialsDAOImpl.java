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
	public boolean addLoginCredentials(LoginCredentials loginCredentials) {
		boolean getStatus = false;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			System.out.println("In login dao impl");
			session.beginTransaction();
			System.out.println("before mapper");
			int result = 0;
			result = (Integer) session.save(LoginCredentialsMapper.mapLoginCredentials(loginCredentials));
			System.out.println(result);
			System.out.println("after mapper");
			session.getTransaction().commit();
			System.out.println("Data inserted successfully!");
			getStatus = true;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return getStatus;
	}

}
