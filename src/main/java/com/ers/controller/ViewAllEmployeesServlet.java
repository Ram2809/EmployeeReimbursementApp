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
import com.ers.service.SignupService;
import com.ers.service.SignupServiceImpl;

/**
 * Servlet implementation class ViewAllEmployeesServlet
 */
public class ViewAllEmployeesServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie[] c = request.getCookies();
		String userName = c[0].getValue();
		SignupService signupServiceImpl = new SignupServiceImpl();
		List<SignupEntity> allEmployeesList = signupServiceImpl.getAllEmployees();
		for (SignupEntity re : allEmployeesList) {
			System.out.println(re.getFirstName());
			System.out.println(re.getLastName());
			System.out.println(re.getDateOfBirth());
			System.out.println(re.getAge());
			System.out.println(re.getGender());
			System.out.println(re.getEmail());
			System.out.println(re.getAddress());
			System.out.println(re.getEmployeeType());
		}
		out.println("<head>");
		out.println("<meta name='viewport' content=width'device-width, initial-scale=1'>");
		out.println("<link rel='stylesheet'	href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>");
		out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>");
		out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>");
		out.println("<style>");
		out.println("table{");
		out.println("max-width:700px");
		out.println("margin:auto");
		out.println("border:150px");
		out.println("padding:50px");
		out.println("}");
		out.println("</style");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<marquee><h1>Welcome"+" "+userName+"</H1></marquee>");
		out.println("<table class='table table-hover'>");
		out.println("<caption><center><h4><b><i>Employee Details</i></b></h4></center></caption>");
		out.println("<tr>");
		out.println("<th>First Name</th>");
		out.println("<th>Last Name</th>");
		out.println("<th>Date of Birth</th>");
		out.println("<th>Age</th>");
		out.println("<th>Gender</th>");
		out.println("<th>Email</th>");
		out.println("<th>Address</th>");
		out.println("<th>Employee Type</th>");
		out.println("</tr>");
		for (SignupEntity re : allEmployeesList) {
			out.println("<tr>");
			out.println("<td>" + re.getFirstName() + "</td>");
			out.println("<td>" + re.getLastName() + "</td>");
			out.println("<td>" + re.getDateOfBirth() + "</td>");
			out.println("<td>" + re.getAge() + "</td>");
			out.println("<td>" + re.getGender() + "</td>");
			out.println("<td>" + re.getEmail() + "</td>");
			out.println("<td>" + re.getAddress() + "</td>");
			out.println("<td>" + re.getEmployeeType() + "</td>");
			out.println("</tr");
		}
		out.println("</tr>");
		out.println("</table>");
		out.println("<a href='Manager.jsp'><input type='submit' value='Go To Home Page'></a>");
		out.println("</center>");
		out.println("</body>");

	}

}
