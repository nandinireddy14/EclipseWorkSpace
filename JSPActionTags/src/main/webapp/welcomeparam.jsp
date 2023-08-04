<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>param action example<</title>
</head>
<body>
<h3>Hello this is a param action example.</h3>
	  <jsp:forward page="homeparam.jsp">
	     <jsp:param name="websiteName" value="www.w3spoint.com"/>
	  </jsp:forward>
</body>
</html>