package com.ers.service;

import java.util.List;

import com.ers.dao.ReimbursementRequestDAO;
import com.ers.dao.ReimbursementRequestDAOImpl;
import com.ers.entity.SignupEntity;
import com.ers.model.ReimbursementRequest;
import com.ers.model.Signup;

public class ReimbursementRequestServiceImpl implements ReimbursementRequestService {
	ReimbursementRequestDAO reimbursementRequestDAOImpl = (ReimbursementRequestDAO) new ReimbursementRequestDAOImpl();

	public boolean addReimbursementRequestDetails(ReimbursementRequest reimbursementRequest,String email) {
		return reimbursementRequestDAOImpl.addReimbursementRequestDetails(reimbursementRequest,email);
	}

	@Override
	public List<SignupEntity> getParticularUser(String email) {
		// TODO Auto-generated method stub
		return reimbursementRequestDAOImpl.getParticularUser(email);
	}

}
