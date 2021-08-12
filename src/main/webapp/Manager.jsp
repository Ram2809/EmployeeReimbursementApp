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
.logout{

position:fixed;
right:50px;
top:25px;
}
</style>
<script>
    function goToLoginPage()
    {
        window.location.href="Login.html"
    }
    function goToLogoutPage()
    {
        window.location.href="Logout.html";
    }
</script>
</head>
<body>
<header>
<marquee direction="right"><h1>Welcome to <%String username= (String)request.getAttribute("attributeName");out.println(username);%></h1></marquee>
    <div style="float:right">
        <form align="right" name="form1" method="post">
          <label class="logout">
          <input name="login" type="submit" id="login" value="Login" onclick="goToLoginPage()">
          <input name="logout" type="submit" id="logout" value="Logout" onclick="goToLogoutPage()">
          </label>
        </form>
        </div>
</header>


<div class="row">
  <div class="left" style="background-color:cyan;">
    <h2>Account Settings</h2>
    <ul id="myMenu">
      <li><a href="http://localhost:8080/EmployeeReimbursementApp/ManagerActionServlet">Approve / Deny Requests</a></li>
      <li><a href="http://localhost:8080/EmployeeReimbursementApp/ViewAllPendingRequests">View Pending Requests </a></li>
      <li><a href="http://localhost:8080/EmployeeReimbursementApp/ViewAllApprovedRequests">View Resolved Requests</a></li>
      <li><a href="http://localhost:8080/EmployeeReimbursementApp/ViewAllDeniedRequests">View Denied Requests</a></li>
      <li><a href="http://localhost:8080/EmployeeReimbursementApp/ViewSpecificEmployeeRequest">View Request of Specific Employee</a></li>
      <li><a href="http://localhost:8080/EmployeeReimbursementApp/ViewAllEmployeesServlet">View all Employees</a></li>
      <li><a href="http://localhost:8080/EmployeeReimbursementApp/DeleteSpecificEmployee">Delete Specific Employee</a></li>
      <li><a href="http://localhost:8080/EmployeeReimbursementApp/UpdateProfileServlet">Update Profile</a></li>
      <li><a href="http://localhost:8080/EmployeeReimbursementApp/ViewProfileServlet">View Profile</a></li>
      <li><a href="http://localhost:8080/EmployeeReimbursementApp/ResetPassWord.html">Reset Password</a></li>
    </ul>
  </div>
  
  <div class="right" style="background-color:#ddd;">
    <h2>Page Content</h2>
    <p>Start to type for a specific category inside the search bar to "filter" the search options.</p>
    <p>Some text..Some text..Some text..Some text..Some text..Some text..Some text..Some text..</p>
    <p>Some other text..Some text..Some text..Some text..Some text..Some text..Some text..Some text..</p>
    <p>Some text..</p>
  </div>
</div>


</body>
</html>
    