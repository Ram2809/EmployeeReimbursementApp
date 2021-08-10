package com.ers.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.ers.entity.SignupEntity;
import com.ers.model.Signup;
import com.ers.util.HibernateUtil;
import com.ers.util.SignupMapper;

public class SignupDAOImpl implements SignupDAO {

	@Override
	public boolean addEmployeeDetails(Signup signup) {
		// TODO Auto-generated method stub
		boolean getStatus = false;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			SignupEntity sessionEntity = SignupMapper.mapSignup(signup);
			session.save(sessionEntity);
			session.getTransaction().commit();
			System.out.println("Data inserted successfully");
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
