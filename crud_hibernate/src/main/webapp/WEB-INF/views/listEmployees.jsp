<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee list</title>
</head>
<body>
<h2>Employee List</h2>
	<table align="center" border="1px">
	    <tr>
	       <th>ID</th>
	       <th> NAME</th>	       
	       <th>AGE</th>
	    </tr>
	    <c:forEach var="emp" items="${list}">
	    	<tr>
	    	   <td>${emp.sid}</td>	          
	           <td>${emp.name}</td>
	           <td>${emp.age}</td>
           </tr>
	    </c:forEach>    
	</table>	
</body>
</html>