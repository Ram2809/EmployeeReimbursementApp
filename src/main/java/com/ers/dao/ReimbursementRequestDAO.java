package com.ers.dao;

import java.util.List;

import com.ers.entity.SignupEntity;
import com.ers.model.ReimbursementRequest;
import com.ers.model.Signup;

public interface ReimbursementRequestDAO {
	public boolean addReimbursementRequestDetails(ReimbursementRequest reimbursementRequest,String email);
	public List<SignupEntity> getParticularUser(String email);
}
