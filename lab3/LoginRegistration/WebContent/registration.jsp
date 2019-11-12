<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrations</title>
</head>
<body>
<div align="center">
<form action="Registration" method="post">
  
    <h1>Register</h1>
    	
	<label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required><br/><br/>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required><br/><br/>
	
    <button type="submit" class="registrationbtn" value="Registration">Register</button>
  
  
    <p>Already have an account? <a href="login.jsp">Sign in</a>.</p>
  
</form>
</div>
</body>
</html>

