package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.LoginCredentialsEntity;
import com.ers.entity.LoginEntity;
import com.ers.model.Login;
import com.ers.service.LoginService;
import com.ers.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("uname");
		String passWord = request.getParameter("pwd");
		out.println(userName + " " + passWord);
		LoginService loginServiceImpl = (LoginService) new LoginServiceImpl();
		List<LoginCredentialsEntity> loginList = loginServiceImpl.validateUser();
		for(LoginCredentialsEntity e: loginList)
		{
			if(e.getUserName().equals(userName)&&e.getPassWord().equals(passWord))
			{
				response.sendRedirect("http://localhost:8080/EmployeeReimbursementApp/SuccessLogin.html");
			}
			else
			{
				response.sendRedirect("http://localhost:8080/EmployeeReimbursementApp/FailureLogin.html");
			}
		}
		
	}

}
