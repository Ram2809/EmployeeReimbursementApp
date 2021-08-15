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
 * Servlet implementation class UpdateProfileServlet
 */
public class UpdateProfileServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie[] c=request.getCookies();
		String userName=c[0].getValue();
		SignupService signupServiceImpl=new SignupServiceImpl();
		List<SignupEntity> employeeList=signupServiceImpl.getEmployeeDetails(userName);
		boolean genderFlag=false;
		for(SignupEntity elist : employeeList)
		{
			System.out.println(elist.getFirstName());
			System.out.println(elist.getLastName());
			System.out.println(elist.getDateOfBirth());
			System.out.println(elist.getAge());
			System.out.println(elist.getGender());
			if(elist.getGender().equals("Male"))
			{
				genderFlag=true;
			}
			
			System.out.println(userName);
			System.out.println(elist.getContactNo());
			System.out.println(elist.getAddress());
			System.out.println(elist.getEmployeeType());
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
		out.println("<form action='http://localhost:8080/EmployeeReimbursementApp/UpdateInfoServlet' method='GET'>");
		out.println("<table class='table table-hover'>");
		out.println("<caption><center><h4><b><i>Edit Profile</i></b></h4></center></caption>");

		for(SignupEntity elist : employeeList)
		{
			out.println("<tr>");
			out.println("<th>First name</th>");
			out.println("<td><input type='text' name='fname' value="+elist.getFirstName());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>Last name</th>");
			out.println("<td><input type='text' name='lname' value="+elist.getLastName());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>Date of Birth</th>");
			out.println("<td><input type='date' name='dob' value="+elist.getDateOfBirth());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>Age</th>");
			out.println("<td><input type='number' name='age' value="+elist.getAge());
			out.println("</td>");
			out.println("</tr");
			if(genderFlag)
			{
				out.println("<tr>");
				out.println("<th rowspan='2'> Gender</th>");
				out.println("<td><input type='radio' name='radioGender' checked value="+elist.getGender());
				out.println("<label for='male'>Male</label>");
				out.println("</td>");
				out.println("</tr");
				out.println("<tr>");
				out.println("<td><input type='radio' name='radioGender'value="+elist.getGender());
				out.println("<label for='female'>Female</label>");
				out.println("</td>");
				out.println("</tr");
			}
			else
			{
				out.println("<tr>");
				out.println("<th rowspan='2'> Gender</th>");
				out.println("<td><input type='radio' name='radioGender' value="+elist.getGender());
				out.println("<label for='male'>Male</label>");
				out.println("</td>");
				out.println("</tr");
				out.println("<tr>");
				out.println("<td><input type='radio' name='radioGender' checked value="+elist.getGender());
				out.println("<label for='female'>Female</label>");
				out.println("</td>");
				out.println("</tr");
			}
			out.println("<tr>");
			out.println("<th>Email</th>");
			out.println("<td><input type='email' name='email' value="+elist.getEmail());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>Contact Number</th>");
			out.println("<td><input type='text' name='contactno' value="+elist.getContactNo());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>Address</th>");
			out.println("<td><input type='text' name='address' value="+elist.getAddress());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>Employee Type</th>");
			out.println("<td><select name='etype' >");
			out.println("<option value='Manager'>Manager");
			out.println("<option value='Employee'>Employee");
			out.println("</select>");
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<center>");
			out.println("<td colspan='2'><center><input id='submitButton' type='submit' value='Update'></center>");
			out.println("</td>");
			out.println("</center>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</form>");
		out.println("</center>");
		out.println("</body>");
	}

}
