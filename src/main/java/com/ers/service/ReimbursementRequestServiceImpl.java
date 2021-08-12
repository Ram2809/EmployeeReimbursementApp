package com.ers.service;

import java.util.List;

import com.ers.dao.ReimbursementRequestDAO;
import com.ers.dao.ReimbursementRequestDAOImpl;
import com.ers.entity.ReimbursementRequestEntity;
import com.ers.entity.SignupEntity;
import com.ers.model.ReimbursementRequest;
import com.ers.model.Signup;

public class ReimbursementRequestServiceImpl implements ReimbursementRequestService {
	ReimbursementRequestDAO reimbursementRequestDAOImpl = (ReimbursementRequestDAO) new ReimbursementRequestDAOImpl();

	public boolean addReimbursementRequestDetails(ReimbursementRequest reimbursementRequest, String email) {
		return reimbursementRequestDAOImpl.addReimbursementRequestDetails(reimbursementRequest, email);
	}

	@Override
	public List<SignupEntity> getParticularUser(String email) {
		// TODO Auto-generated method stub
		return reimbursementRequestDAOImpl.getParticularUser(email);
	}

	@Override
	public List<ReimbursementRequestEntity> getParticularUserPendingRequests(String userName) {
		// TODO Auto-generated method stub
		return reimbursementRequestDAOImpl.getParticularUserPendingRequests(userName);
	}

	@Override
	public List<ReimbursementRequestEntity> getParticularUserApprovedRequests(String userName) {
		// TODO Auto-generated method stub
		return reimbursementRequestDAOImpl.getParticularUserApprovedRequests(userName);
	}

	@Override
	public List<ReimbursementRequestEntity> getParticularUserDeniedRequests(String userName) {
		// TODO Auto-generated method stub
		return reimbursementRequestDAOImpl.getParticularUserDeniedRequests(userName);
	}

	@Override
	public List<ReimbursementRequestEntity> getParticularUserAllRequests(String userName) {
		// TODO Auto-generated method stub
		return reimbursementRequestDAOImpl.getParticularUserAllRequests(userName);
	}

	@Override
	public List<ReimbursementRequestEntity> getAllPendingRequests() {
		// TODO Auto-generated method stub
		return reimbursementRequestDAOImpl.getAllPendingRequests();
	}

	@Override
	public List<ReimbursementRequestEntity> getAllApprovedRequests() {
		// TODO Auto-generated method stub
		return reimbursementRequestDAOImpl.getAllApprovedRequests();
	}

	@Override
	public List<ReimbursementRequestEntity> getAllDeniedRequests() {
		// TODO Auto-generated method stub
		return reimbursementRequestDAOImpl.getAllDeniedRequests();
	}

	@Override
	public List<String> getRequestIds() {
		// TODO Auto-generated method stub
		return reimbursementRequestDAOImpl.getRequestIds();
	}

	@Override
	public List<ReimbursementRequestEntity> getDetailsById(String requestId) {
		return reimbursementRequestDAOImpl.getDetailsById(requestId);
	}

	@Override
	public boolean updateRequestStatus(String requestId, String managerAction) {
		return reimbursementRequestDAOImpl.updateRequestStatus(requestId, managerAction);
	}

}
