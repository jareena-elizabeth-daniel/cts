<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <%
      String u = (String)request.getAttribute("uname");
      String p = (String)request.getAttribute("pw");
      out.write(u);
      out.write(p);      
   %>
</body>
</html>