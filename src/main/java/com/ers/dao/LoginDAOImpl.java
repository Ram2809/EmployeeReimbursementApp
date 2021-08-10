package com.ers.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ers.entity.LoginCredentialsEntity;
import com.ers.entity.LoginEntity;
import com.ers.model.Login;
import com.ers.util.HibernateUtil;

public class LoginDAOImpl implements LoginDAO {

	public List<LoginCredentialsEntity> validateUser() {
		boolean status = false;
		List<LoginCredentialsEntity> loginList = new ArrayList<>();
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("from LoginCredentialsEntity l");
			loginList = query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {

		}
		return loginList;
	}

}
