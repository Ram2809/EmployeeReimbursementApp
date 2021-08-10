package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.service.LoginService;
import com.ers.service.LoginServiceImpl;

/**
 * Servlet implementation class ForgotPassWordServlet
 */
public class ForgotPassWordServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName ="makesh.a@revature.com"; //request.getParameter("username");
		String passWord ="mnmnmn"; //request.getParameter("newPassword");
		String confirmPassword = "mnmnmn";//request.getParameter("confirmPassword");
		System.out.println(userName + " " + passWord + " " + confirmPassword);
		if (passWord.equals(confirmPassword)) {
			LoginService loginServiceImpl = new LoginServiceImpl();
			boolean getStatus = loginServiceImpl.updateForgotPassword(userName,passWord);
		}
	}

}
