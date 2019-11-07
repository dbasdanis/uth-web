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
<h2>Registration</h2>
User name : <input type="text" name="user" required="required"><br/><br/>
Password : <input type="password" name="password" required="required"><br/><br/> 
<input type="submit" value="REGISTER"><br/><br/>
<h4>Do you have already an account?</h4>
<a href="login.jsp">Login</a>
</form>
</div>
</body>
</html>
