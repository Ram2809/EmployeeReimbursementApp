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
 * Servlet implementation class PrintReimbursementReceipt
 */
public class PrintReimbursementReceipt extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie c[]=request.getCookies();
		String userName=c[0].getValue();
		String requestId=request.getParameter("reqId");
		System.out.println(requestId);
		ReimbursementRequestService reimbursementRequestServiceImpl=new ReimbursementRequestServiceImpl();
		List<ReimbursementRequestEntity> requestDetailsList=reimbursementRequestServiceImpl.getDetailsById(requestId);
		for (ReimbursementRequestEntity re : requestDetailsList) {
			System.out.println(re.getUserEmail().getFirstName());
			System.out.println(re.getUserEmail().getLastName());
			System.out.println(re.getUserEmail().getEmail());
			System.out.println(re.getReqId());
			System.out.println(re.getReqType());
			System.out.println(re.getReqDate());
			System.out.println(re.getReqAmount());
			System.out.println(re.getReqDescription());
			System.out.println(re.getReqStatus());
			System.out.println(re.getReqActionDate());
			System.out.println(re.getReqActionRemarks());
		}
		out.println("<head>");
		out.println("<meta name='viewport' content=width'device-width, initial-scale=1'>");
		out.println("<link rel='stylesheet'	href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>");
		out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script>");
		out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>");
		out.println("<style>");
		out.println("table{");
		out.println("width:75%");
		out.println("margin:200px");
		out.println("border:150px");
		out.println("padding:50px");
		out.println("}");
		out.println("</style");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<marquee><h1>Welcome"+" "+userName+"</H1></marquee>");
		out.println("<form action='http://localhost:8080/EmployeeReimbursementApp/PrintSuccessReceipt' method='GET'>");
		out.println("<table class='table table-hover'>");
		out.println("<caption><center><h4><b><i>Reimbursement Action Form</i></b></h4></center></caption>");
		for(ReimbursementRequestEntity re : requestDetailsList)
		{
			out.println("<tr>");
			out.println("<th>First Name</th>");
			out.println("<td><input type='text' name='empName' value="+re.getUserEmail().getFirstName());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>Last Name</th>");
			out.println("<td><input type='text' name='empName' value="+re.getUserEmail().getLastName());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>User Name</th>");
			out.println("<td><input type='text' name='userName' value="+re.getUserEmail().getEmail());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>Request ID</th>");
			out.println("<td><input type='text' name='reqId' value="+re.getReqId());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>Request Type</th>");
			out.println("<td><input type='text' name='reqType' value="+re.getReqType());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>Request Submitted Date</th>");
			out.println("<td><input type='text' name='reqDate' value="+re.getReqDate());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>Request Amount</th>");
			out.println("<td><input type='text' name='reqAmount' value="+re.getReqAmount());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>Request Status</th>");
			out.println("<td><input type='text' name='reqStatus' value="+re.getReqStatus());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<th>Request Approved Date</th>");
			out.println("<td><input type='text' name='reqActionDate' value="+re.getReqActionDate());
			out.println("</td>");
			out.println("</tr");
			out.println("<tr>");
			out.println("<td colspan='2'><center><input id='submitButton' type='submit' value='Print Receipt' onclick='window.print()'></center>");
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		//out.println("<input id='submitButton' type='submit' value='Submit'>");
		out.println("</center>");
		out.println("</form>");
		out.println("</body>");
	}

}
