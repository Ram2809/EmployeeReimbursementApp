package com.ers.service;

import java.util.List;

import com.ers.entity.SignupEntity;
import com.ers.model.ReimbursementRequest;
import com.ers.model.Signup;

public interface ReimbursementRequestService {
	public boolean addReimbursementRequestDetails(ReimbursementRequest reimbursementRequest,String email);
	public List<SignupEntity> getParticularUser(String email);
}
