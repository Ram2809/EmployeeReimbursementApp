package com.ers.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.ers.entity.ReimbursementRequestEntity;
import com.ers.entity.SignupEntity;
import com.ers.model.ReimbursementRequest;
import com.ers.model.Signup;
import com.ers.util.HibernateUtil;
import com.ers.util.ReimbursementRequestMapper;

public class ReimbursementRequestDAOImpl implements ReimbursementRequestDAO {

	public boolean addReimbursementRequestDetails(ReimbursementRequest reimbursementRequest,String email) {
		boolean getStatus = false;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			System.out.println("before mapper");
			ReimbursementRequestEntity re=ReimbursementRequestMapper.mapReimbursementRequest(reimbursementRequest,email);
			System.out.println(re);
			session.beginTransaction();
			session.save(re);
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

	@Override
	public List<SignupEntity> getParticularUser(String email) {
		// TODO Auto-generated method stub
		List<SignupEntity> employeeList=new ArrayList<>();
		System.out.println(email);
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Query query=session.createQuery("FROM SignupEntity s where email=:userName");
			query.setParameter("userName", email);
			employeeList=query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		return employeeList;
	}

	@Override
	public List<ReimbursementRequestEntity> getParticularUserPendingRequests(String userName) {
		List<ReimbursementRequestEntity> pendingList=new ArrayList<>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Query query=session.createQuery("FROM ReimbursementRequestEntity r where email=:userId and reqStatus=:status");
			
			query.setParameter("userId", userName);
			query.setParameter("status", "Pending");
			pendingList=query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		return pendingList;
	}

	@Override
	public List<ReimbursementRequestEntity> getParticularUserApprovedRequests(String userName) {
		List<ReimbursementRequestEntity> approvedList=new ArrayList<>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Query query=session.createQuery("FROM ReimbursementRequestEntity r where email=:userId and reqStatus=:status");
			
			query.setParameter("userId", userName);
			query.setParameter("status", "Accepted");
			approvedList=query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		return approvedList;
	}

	@Override
	public List<ReimbursementRequestEntity> getParticularUserDeniedRequests(String userName) {
		List<ReimbursementRequestEntity> rejectedList=new ArrayList<>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Query query=session.createQuery("FROM ReimbursementRequestEntity r where email=:userId and reqStatus=:status");
			
			query.setParameter("userId", userName);
			query.setParameter("status", "Denied");
			rejectedList=query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		return rejectedList;
	}

	@Override
	public List<ReimbursementRequestEntity> getParticularUserAllRequests(String userName) {
		List<ReimbursementRequestEntity> allRequestList=new ArrayList<>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			Query query=session.createQuery("FROM ReimbursementRequestEntity r where email=:userId");
			
			query.setParameter("userId", userName);
			allRequestList=query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		return allRequestList;
	}

}
