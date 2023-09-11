<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList,java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
<h1>This is home page</h1>
<p>Called by HomeController</p>
<p>url /home</p>
<%
String name=(String) request.getAttribute("name");
int id =(Integer) request.getAttribute("id");
List<String> friends=(List<String>) request.getAttribute("friends");


%>
<h2>My name is <%=name %></h2>
<h2>Id is <%=id %></h2>
<%
for(String f:friends){
	out.println(f);
%>
<h2><%=f %></h2>
<%} %>
</body>
</html>