<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All users</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>name</th><th>phone number</th><th>role</th><th>Access</th><th>Access</th>
</tr>  
   <c:forEach var="user" items="${users}">   
   <tr>  
   <td>${user.name}</td>  
    <td>${user.phone}</td>
    <td>${user.role}</td>
    <td>${user.userId}</td>
    <c:set var = "role" value = "${user.role}"/>

	
	<c:if test = "${role == 'ROLE_ADMIN'}">      
   	<td><a href="user/${user.userId}?access=user" >change to user</a></td>  
	</c:if> 
	<c:if test = "${role == 'ROLE_USER'}">      
   	<td><a href="user/${user.userId}?access=admin" >change to admin</a></td>  
	</c:if> 
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="/shnell/allflights">back</a> 
</body>
</html>