<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.time.LocalDateTime" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
<h2>This is help page</h2>
<%-- 
<%
String name=(String) request.getAttribute("name");
int rno=(Integer) request.getAttribute("rollnum");
LocalDateTime time=(LocalDateTime) request.getAttribute("time");

%> --%>
<h2>My name is <%-- <%=name %> --%>${name}</h2>
<h2>Id is <%-- <%=rno %> --%>${rollnum}</h2>
<h2>Time is <%-- <%=time %> --%>${time}</h2>

<hr>
<c:forEach var="item" items='${marks}'>
<p>${item}</p>
</c:forEach>

</body>
</html>