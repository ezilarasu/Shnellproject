<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>flights</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>airlines</th><th>source</th><th>Designation</th><th>fare</th><th>availableDate</th>
<th>departureTime</th><th>arrivalTime</th>
 
<security:authorize access="hasRole('ROLE_ADMIN')">
 <th>edit</th><th>delete</th>  
</security:authorize>
</tr>  
   <c:forEach var="flight" items="${flights}">   
   <tr>  
   <td>${flight.airlines}</td>  
    <td>${flight.source}</td>
    <td>${flight.destination}</td>
    <td>${flight.fare}</td>
    <td><fmt:formatDate type = "date" value = "${flight.flightAvailableDate}" /></td>
    <td>${flight.departureTime}</td>
    <td>${flight.arrivalTime}</td>
       
    <security:authorize access="hasRole('ROLE_ADMIN')">
    <td><a href="edit/${flight.flightId}" >Edit</a></td>
</security:authorize>
    
   <security:authorize access="hasRole('ROLE_ADMIN')">
    <td><form:form method="post" action="delete/${flight.flightId}"><input type="submit" value="delete" /></form:form></td>
</security:authorize>
 
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
    
   <security:authorize access="hasRole('ROLE_ADMIN')">
    <a href="addflights">Add New flights</a>
</security:authorize>
     <security:authorize access="hasRole('ROLE_ADMIN')">
    <a href="allusers">all users</a>
</security:authorize>

   <a href="logout">logout</a> 
  
</body>
</html>