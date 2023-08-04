<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.Random,java.util.ArrayList"  %>
 <%@ page isErrorPage="true" %>

 <%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1>
Random Number:
<%
Random random=new Random();
int r=random.nextInt(10);
out.println(r);
%>

<%=r %>
</h1>
</body>
</html>