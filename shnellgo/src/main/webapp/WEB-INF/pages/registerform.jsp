<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" action="registeruser" modelAttribute="user">    
        <table >    
         <tr>    
          <td>password : </td>   
          <td><form:input type="password" path="password"  /></td>  
         </tr>    
         <tr>    
          <td>name :</td>    
          <td><form:input type="text" path="name" /></td>  
         </tr>   
         <tr>    
          <td>city :</td>    
          <td><form:input  type="text" path="city" /></td>  
         </tr>  
         <tr>    
          <td>email :</td>    
          <td><form:input type="text" path="email" /></td>  
         </tr>
         <tr>    
          <td>phone :</td>    
          <td><form:input type="text" path="phone" /></td>  
         </tr>  
          <td><input type="submit" value="Submit" /></td>    
         </tr>    
        </table>    
       </form:form>   
</body>
</html>