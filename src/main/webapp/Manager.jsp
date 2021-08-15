<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Manager Page</title>
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
	 background: url('employee.png') no-repeat center fixed;     
    background-size: cover;
}

.left h2 {
	padding-left: 8px;
}
</style>
</head>
<body>
	<header style="background-color: rgb(27, 154, 163);">
		<center>
			<marquee><h1 style="color:white"><b><i>Manager Section</i></b></h1></marquee>
		</center>
	</header>

	<div class="row">
			<div class="left" style="background-color:rgb(23, 109, 131);">
			<ul id="myMenu">
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ManagerActionServlet" target="_self">Approve
						/ Deny Requests </a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewAllPendingRequests" target="_self">View
						Pending Requests </a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewAllApprovedRequests" target="_self">View
						Resolved Requests</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewAllDeniedRequests" target="_self">View
						Denied Requests</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewSpecificEmployeeRequest" target="_self">View
						Request of Specific Employee</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewAllEmployeesServlet" target="_self">View
						all Employees</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/DeleteSpecificEmployee" target="_self">Delete
						Specific Employee</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/UpdateProfileServlet" target="_self">Update
						Profile</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewProfileServlet" target="_self">View
						Profile</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ResetPassWord.html" target="_self">Reset
						Password</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/Logout.html">Logout</a></li>
			</ul>
		</div>
	<%Cookie[] arr=request.getCookies();
	String userName=arr[0].getValue();%>
	<div class="right" style="background-color: #ddd;">
			 <center><h2 id="welcome"><b><i>Welcome <%out.println(userName); %></i></b></h4></center>

		</div>
	</div>
	 <footer style="background-color: rgb(27, 154, 163);">
		 <center>
                <p><b>Contact us</b></p>
                <p><%out.println(userName); %></p>
            </center>

		</center>
	</footer>


</body>
</html>
