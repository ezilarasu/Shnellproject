<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" action="/shnell/editsave" modelAttribute="flight">    
        <table >    
         <tr>    
          <td>flightId : </td> 
          <td><form:label path = "flightId">${flight.flightId}</form:label></td>  
          <td><form:hidden   path="flightId"  /></td>  
         </tr>    
         <tr>    
          <td>airlines :</td>  
          <td><form:label path = "flightId">${flight.airlines}</form:label></td>  
          <td><form:hidden  path="airlines" /></td>  
         </tr>   
         <tr>    
          <td>source :</td>    
          <td><form:input  type="text" path="source" value="${flight.source}"/></td>  
         </tr>  
         <tr>    
          <td>destination :</td>    
          <td><form:input type="text" path="destination" value="${flight.destination}" /></td>  
         </tr>
         <tr>    
          <td>fare :</td>
          <td><form:label path = "fare">${flight.fare}</form:label></td>  
          <td><form:hidden  path="fare" /></td>  
         </tr>
         <tr>    
          <td>flightAvailableDate :</td>   
          <td><form:label path = "flightAvailableDate">${flight.flightAvailableDate}</form:label></td> 
          <td><form:hidden  path="flightAvailableDate" /></td>  
         </tr>
         <tr>    
          <td>departureTime :</td>
          <td><form:label path = "departureTime">${flight.departureTime}</form:label></td>
          <td><form:hidden  path="departureTime" /></td>  
         </tr>
         <tr> 
          
          <td>arrivalTime :</td>  
          <td><form:label path = "arrivalTime">${flight.arrivalTime}</form:label></td>  
          <td><form:hidden  path="arrivalTime" /></td>  
         </tr> 
         <tr>    
          <td>seatCount :</td>  
          <td><form:label path = "seatCount">${flight.seatCount}</form:label></td>  
          <td><form:hidden  path="seatCount" /></td>  
         </tr>
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Submit" /></td>    
         </tr>    
        </table>    
       </form:form>   
</body>
</html>