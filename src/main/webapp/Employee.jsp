<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="com.ers.entity.SignupEntity" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<title>Employee Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

#myMenu {
	list-style-type: none;
	padding: 15px;
	margin: 0;
}

#myMenu li a {
	padding: 12px;
	text-decoration: none;
	color: black;
	display: block
}

#myMenu li a:hover {
	background-color: #eee;
}
/* Create a column layout with Flexbox */
.row {
	display: flex;
}

/* Left column (menu) */
.left {
	flex: 10%;
	padding: 15px 0;
}
/* Right column (page content) */
.right {
	flex: 65%;
	padding: 15px;
}

.left h2 {
	padding-left: 8px;
}

#welcome {
	float: right;
}
</style>
</head>
<body>
	<header>
		<center>
			<h1>
				<b><i>Employee Section</i></b>
			</h1>
		</center>
	</header>
	<div class="row">
		<div class="left" style="background-color: rgb(47, 85, 85);">
			<ul id="myMenu">
				<li><a href="ReimbursementRequest.html">Submit New Request</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewEmployeePendingRequest">View
						Pending Requests </a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewEmployeeApporvedRequest">View
						Resolved Requests</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewEmployeeDeniedRequest">View
						Denied Requests</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewEmployeeAllRequest">View
						All Requests</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/UpdateProfileServlet">Update
						Profile</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewProfileServlet" target="_self">View
						Profile</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ResetPassWord.html">Reset
						Password</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/Logout.html">Logout</a></li>
			</ul>
		</div>

		<div class="right" style="background-color: #ddd;">
			<h4 id="welcome">
				<b>Welcome <a href="http://localhost:8080/EmployeeReimbursementApp/ViewProfileServlet">User</a>
				</u></b>
			</h4>
			<!String username = (String) request.getAttribute("attributeName");
out.println(username);e); %>

		</div>
	</div>
	<footer>
		<center>
			<p>
				<b>Contact us</b>
			</p>

		</center>
	</footer>
</body>
</html>