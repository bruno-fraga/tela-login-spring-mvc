<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http:www.w3.org/TR/html4/loose.dtd>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>

<body>
	<a href='<c:url value="/logout" /> '>Logout</a>
	<h1>Bem Vindo<c:if test="${pageContext.request.userPrincipal.name != null } ">${pageContext.request.userPrincipal.name }</c:if></h1>
	<br/>
	
	<a href='<c:url value="/user/list "/> '>User List</a>
	
	
	
</body>
</html>