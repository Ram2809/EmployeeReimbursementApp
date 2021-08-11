package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.LoginCredentialsEntity;
import com.ers.service.LoginService;
import com.ers.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean status = false;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("uname");
		String passWord = request.getParameter("pwd");
		out.println(userName + " " + passWord);
		Cookie cUserName=new Cookie("cusername",userName);
		response.addCookie(cUserName);
		LoginService loginServiceImpl = (LoginService) new LoginServiceImpl();
		List<LoginCredentialsEntity> loginList = loginServiceImpl.validateUser();
		for (LoginCredentialsEntity e : loginList) {
			if (e.getUserName().equals(userName) && e.getPassWord().equals(passWord)) {
				status = true;
				request.setAttribute("attributeName", userName);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");
				requestDispatcher.forward(request, response);
			}
		}
		if (!status) {
			response.sendRedirect("http://localhost:8080/EmployeeReimbursementApp/FailureLogin.html");
		}
		

	}

}
