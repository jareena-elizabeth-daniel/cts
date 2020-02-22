<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h2>Student List</h2></center>
<div align="center">
 <table width="40%" border="5px">
	   <tr>
	      <th>ID:</th>
	      <th>NAME:</th>
	      <th>AGE:</th>
	   </tr>
	   <c:forEach var="student" items="${liststud}">
	   <tr>
	     <td>${student.sid}</td>
	     <td>${student.name}</td>
	     <td>${student.age}</td>
	   </tr>
	   </c:forEach>
	</table>
	</div>
</body>
</html>