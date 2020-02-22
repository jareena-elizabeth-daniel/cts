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
<div align="center">
<table border="4px" width = "40%">
	   <tr>
	      <th>Employee ID:</th>
	      <th>Employee NAME:</th>
	      <th>AGE:</th>
	   </tr>
	   <c:forEach var="employee" items="${emplist}">
	   <tr>
	     <td>${employee.eid}</td>
	     <td>${employee.ename}</td>
	     <td>${employee.age}</td>
	   </tr>
	   </c:forEach>
	</table>
	</div>


</body>
</html>