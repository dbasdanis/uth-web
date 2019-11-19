<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<div align="center">
<form action="Login" method="post">
  
    <h1>Login</h1>
    
    <label for="name"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="username" required><br/><br/>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required><br/><br/>
	
    <button type="submit" class="loginbtn" value="Login">Login</button>
 
    <p>You do not have an account? <a href="registration.jsp">Sign up</a>.</p>

</form>
</div>
</body>
</html>