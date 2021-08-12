package com.ers.service;

import java.util.List;

import com.ers.entity.ReimbursementRequestEntity;
import com.ers.entity.SignupEntity;
import com.ers.model.ReimbursementRequest;
import com.ers.model.Signup;

public interface ReimbursementRequestService {
	public boolean addReimbursementRequestDetails(ReimbursementRequest reimbursementRequest,String email);
	public List<SignupEntity> getParticularUser(String email);
	public List<ReimbursementRequestEntity> getParticularUserPendingRequests(String userName);
	public List<ReimbursementRequestEntity> getParticularUserApprovedRequests(String userName);
	public List<ReimbursementRequestEntity> getParticularUserDeniedRequests(String userName);
	public List<ReimbursementRequestEntity> getParticularUserAllRequests(String userName);
	public List<ReimbursementRequestEntity> getAllPendingRequests();
	public List<ReimbursementRequestEntity> getAllApprovedRequests();
	public List<ReimbursementRequestEntity> getAllDeniedRequests();
}
