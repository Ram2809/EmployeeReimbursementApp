package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.model.Signup;
import com.ers.service.SignupService;
import com.ers.service.SignupServiceImpl;

public class SignupServlet extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String dateOfBirth=request.getParameter("dateOfBirth");
		String age=request.getParameter("age");
		String gender=request.getParameter("radioGender");
		String email=request.getParameter("email");
		String contactNo=request.getParameter("contactNo");
		String address=request.getParameter("address");
		String employeeType=request.getParameter("etype");
		System.out.println(firstName+" "+lastName+" "+dateOfBirth+" "+age+" "+gender+" "+email+" "+contactNo+" "+address+" "+employeeType);
		Signup signUp=new Signup();
		signUp.setFirstName(firstName);
		signUp.setLastName(lastName);
		signUp.setDateOfBirth(dateOfBirth);
		signUp.setAge(Integer.parseInt(age));
		signUp.setGender(gender);
		signUp.setEmail(email);
		signUp.setContactNo(contactNo);
		signUp.setAddress(address);
		signUp.setEmployeeType(employeeType);
		SignupService signupServiceImpl=(SignupService) new SignupServiceImpl();
		signupServiceImpl.addEmployeeDetails(signUp);
	}

}
