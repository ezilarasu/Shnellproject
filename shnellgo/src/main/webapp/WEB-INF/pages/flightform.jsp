<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<style>
	.login-form {
		width: 340px;
    	margin: 50px auto;
	}
    .login-form form {
    	margin-bottom: 15px;
        background: #f7f7f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
    .login-form h2 {
        margin: 0 0 15px;
    }
    .form-control, .btn {
        min-height: 38px;
        border-radius: 2px;
    }
    .btn {        
        font-size: 15px;
        font-weight: bold;
    }
</style>
</head>
<body>
<form:form method="post" action="saveflight" modelAttribute="flight">    
        <table >    
         <tr>    
          <td>flightId : </td>   
          <td><form:input type="text" path="flightId"  /></td>  
         </tr>    
         <tr>    
          <td>airlines :</td>    
          <td><form:input type="text" path="airlines" /></td>  
         </tr>   
         <tr>    
          <td>source :</td>    
          <td><form:input  type="text" path="source" /></td>  
         </tr>  
         <tr>    
          <td>destination :</td>    
          <td><form:input type="text" path="destination" /></td>  
         </tr>
         <tr>    
          <td>fare :</td>    
          <td><form:input type="text" path="fare" /></td>  
         </tr>
         <tr>    
          <td>flightAvailableDate :</td>    
          <td><form:input type="date" path="flightAvailableDate" /></td>  
         </tr>
         <tr>    
          <td>departureTime :</td>    
          <td><form:input type="time" path="departureTime" /></td>  
         </tr>
         <tr>    
          <td>arrivalTime :</td>    
          <td><form:input type="time" path="arrivalTime" /></td>  
         </tr> 
         <tr>    
          <td>seatCount :</td>    
          <td><form:input type="text" path="seatCount" /></td>  
         </tr>
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Submit" /></td>    
         </tr>    
        </table>    
       </form:form>   
</body>
</html>