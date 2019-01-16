<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form name="loginForm" action='<c:url value="j_spring_security_check"/> method= "post'>
		<table>
			<tr>
				<td colspan="2">Login<td/>
			
			<tr/>
		
		    <tr>
		    	<td colspan="2">${msg }<td/>
		    
		    <tr/>
		    <tr>
		    	<td>Username: <td/>
		        <td>
		        	<input type ="text" name="username" />
		        <td/>
		        
		    <tr/>
			  <tr>
		    	<td>Password: <td/>
		        <td>
		        	<input type ="password" name="password" />
		        <td/>
		        
		    <tr/>
		
		   <tr/>
			  <tr>
		    	<td>Remember Me: <td/>
		        <td>
		        	<input type ="checkbox" name="remember-me" />
		        <td/>
		        <tr>
		        <td><td/>
		        
		        <td>
		        	<button type="submit" >Login</button>
		        <td/>
		    <tr/>
		    <tr>
		    	<td><td/>
		    	<td>
		    		<a href='<c:url value= "/user/signup"/>'>Sign Up</a>
		    	<td/>
		</table>
	
	
	
	
	
	
	
	</form>




</body>
</html>