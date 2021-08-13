<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

/* Create a column layout with Flexbox */
.row {
	display: flex;
}

/* Left column (menu) */
.left {
	flex: 20%;
	padding: 15px 0;
}

.left h2 {
	padding-left: 8px;
}

/* Right column (page content) */
.right {
	flex: 65%;
	padding: 15px;
}

/* Style the navigation menu inside the left column */
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

.logout {
	position: fixed;
	right: 50px;
	top: 25px;
}
</style>
</head>
<body>
	<header style="background-color: rgb(66, 163, 107)">
		<marquee direction="right">
			<h2>
				Welcome to Manager Section
			</h2>
		</marquee>
		<div style="float: right"></div>
	</header>

	<div class="row">
		<div class="left" style="background-color: cyan;">
			<h2>Account Settings</h2>
			<ul id="myMenu">
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ManagerActionServlet">Approve
						/ Deny Requests</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewAllPendingRequests">View
						Pending Requests </a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewAllApprovedRequests">View
						Resolved Requests</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewAllDeniedRequests">View
						Denied Requests</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewSpecificEmployeeRequest">View
						Request of Specific Employee</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewAllEmployeesServlet">View
						all Employees</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/DeleteSpecificEmployee">Delete
						Specific Employee</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/UpdateProfileServlet">Update
						Profile</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ViewProfileServlet">View
						Profile</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/ResetPassWord.html">Reset
						Password</a></li>
				<li><a
					href="http://localhost:8080/EmployeeReimbursementApp/Logout.html">Logout</a></li>
			</ul>
		</div>

	<div class="right" style="background-color:#ddd;">
    <h1><b>Employee Reimbursement System</b></h1>
    <frameset cols="25%,*,24%">
      <frame>
        <section>
          <center><img src='erspic.png' height='250' width='150'></center>
        </section>
      </frame>
      <frame>
        <aside>
          <p>Expense Reimbursement is the way businesses pay back their employees who have spent their own money on business-related expenses. While reimbursements for business travel is quite common, employees can also be reimbursed for education, healthcare, and other expenses incurred on behalf of the organization.</p>
        </aside>
      </frame>
    </frameset>
  </div>
	</div>


</body>
</html>
