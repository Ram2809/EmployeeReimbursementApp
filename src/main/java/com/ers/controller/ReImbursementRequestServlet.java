package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.SignupEntity;
import com.ers.model.ReimbursementRequest;
import com.ers.model.Signup;
import com.ers.service.ReimbursementRequestService;
import com.ers.service.ReimbursementRequestServiceImpl;

/**
 * Servlet implementation class ReImbursementRequestServlet
 */
public class ReImbursementRequestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String reqId = request.getParameter("reImbursementId");
		String reqType =request.getParameter("reImbursementType");
		Double reqAmount = Double.parseDouble(request.getParameter("reImbursementAmount"));
		String reqDate = request.getParameter("reImbursementSubDate");
		String reqStatus = request.getParameter("reImbursementStatus");
		String reqDescription = request.getParameter("reImbursementDescription");
		System.out.println(
				reqId + " " + reqType + " " + reqAmount + " " + reqDate + " " + reqStatus + " " + reqDescription);
		ReimbursementRequest reimbursementRequest = new ReimbursementRequest();
		reimbursementRequest.setReqId(reqId);
		reimbursementRequest.setReqType(reqType);
		reimbursementRequest.setReqAmount(reqAmount);
		reimbursementRequest.setReqDate(reqDate);
		reimbursementRequest.setReqStatus(reqStatus);
		reimbursementRequest.setReqDescription(reqDescription);
		System.out.println(reimbursementRequest);
		Cookie c[]=request.getCookies();
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i].getName()+" "+c[i].getValue());
		}
		String email=c[0].getValue();
		ReimbursementRequestService reimbursementRequestServiceImpl = (ReimbursementRequestService) new ReimbursementRequestServiceImpl();
		/*List<SignupEntity> getParticularUser=reimbursementRequestServiceImpl.getParticularUser(email);
		Signup signup=new Signup();
		for(SignupEntity empList:getParticularUser)
		{
			signup.setFirstName(empList.getFirstName());
			signup.setLastName(empList.getLastName());
			signup.setDateOfBirth(empList.getDateOfBirth());
			signup.setAge(empList.getAge());
			signup.setEmail(empList.getEmail());
			signup.setContactNo(empList.getContactNo());
			signup.setAddress(empList.getAddress());
			signup.setEmployeeType(empList.getEmployeeType());
			signup.setGender(empList.getGender());
		}*/
		boolean getStatus = reimbursementRequestServiceImpl.addReimbursementRequestDetails(reimbursementRequest,email);
		System.out.println(getStatus);
	}

}
