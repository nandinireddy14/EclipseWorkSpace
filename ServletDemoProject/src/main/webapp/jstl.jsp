<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example of jstl taglib directive</title>
</head>
<body>
<h1>Taglib Directive Examples:</h1>
<hr>
<c:set var="name" value="Centre for Good Governance"></c:set>
<c:out value="${name}"></c:out>
<c:if test="${3>2}">
<h2>this is true block 3>2</h2>
</c:if>

<c:out value="${12+14}"></c:out>

<%!
int n1=200;
int n2=10;
String name=null;
%>
<%
int division =n1/n2;
%>
<h1>Division : <%=division %></h1>
<%=name.length()%>
</body>
</html>