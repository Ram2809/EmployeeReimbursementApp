package com.ers.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ers.entity.ReimbursementRequestEntity;
import com.ers.service.ReimbursementRequestService;
import com.ers.service.ReimbursementRequestServiceImpl;

/**
 * Servlet implementation class ViewAllPendingRequests
 */
public class ViewAllPendingRequests extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie[] c=request.getCookies();
		String userName=c[0].getValue();
		ReimbursementRequestService reimbursementRequestServiceImpl = (ReimbursementRequestService) new ReimbursementRequestServiceImpl();
		List<ReimbursementRequestEntity> allPendingRequestsList =reimbursementRequestServiceImpl.getAllPendingRequests();
		for(ReimbursementRequestEntity re : allPendingRequestsList)
		{
			System.out.println(re.getReqId());
			System.out.println(re.getUserEmail().getEmail());
			System.out.println(re.getUserEmail().getFirstName());
			System.out.println(re.getReqType());
			System.out.println(re.getReqDate());
			System.out.println(re.getReqAmount());
			System.out.println(re.getReqStatus());
			System.out.println(re.getReqDescription());
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
		out.println("<caption><center><h4><b><i>Pending Requests</i></b></h4></center></caption>");
		out.println("<tr>");
		out.println("<th>Request Id</th>");
		out.println("<th>User Name</th>");
		out.println("<th>Employee Name</th>");
		out.println("<th>Request Type</th>");
		out.println("<th>Request Date</th>");
		out.println("<th>Request Amount</th>");
		out.println("<th>Request Status</th>");
		out.println("<th>Request Description</th>");
		
		out.println("</tr>");
		for(ReimbursementRequestEntity re : allPendingRequestsList)
		{
			out.println("<tr>");
			out.println("<td>"+re.getReqId()+"</td>");
			out.println("<td>"+re.getUserEmail().getEmail()+"</td>");
			out.println("<td>"+re.getUserEmail().getFirstName()+"</td>");
			out.println("<td>"+re.getReqType()+"</td>");
			out.println("<td>"+re.getReqDate()+"</td>");
			out.println("<td>"+re.getReqAmount()+"</td>");
			out.println("<td>"+re.getReqStatus()+"</td>");
			out.println("<td>"+re.getReqDescription()+"</td>");
			out.println("</tr");
		}
		out.println("</tr>");
		out.println("</table>");
		out.println("<a href='Manager.jsp'><input type='submit' value='Go To Home Page'></a>");
		out.println("<a href='http://localhost:8080/EmployeeReimbursementApp/ManagerActionServlet'><input type='submit' value='Approve/Deny Request'></a>");
		out.println("</center>");
		out.println("</body>");
		
	}

}
