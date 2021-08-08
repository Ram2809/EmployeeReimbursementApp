package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.model.LoginCredentials;
import com.ers.service.LoginCredentialsService;
import com.ers.service.LoginCredentialsServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginCredentialsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String userName=request.getParameter("uname");
		String passWord=request.getParameter("pwd");
		System.out.println(userName+" "+passWord);
		LoginCredentials loginCredentials=new LoginCredentials();
		loginCredentials.setUserName(userName);
		loginCredentials.setPassWord(passWord);
		LoginCredentialsService loginCredentialsServiceImpl=(LoginCredentialsService) new LoginCredentialsServiceImpl();
		loginCredentialsServiceImpl.addLoginCredentials(loginCredentials);
		
	}

}
