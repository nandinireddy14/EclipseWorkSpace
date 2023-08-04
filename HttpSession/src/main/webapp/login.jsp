<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="border:1px solid black;text-align:center;padding:10px;">
<h1>Enter your details</h1>
<form action="loginServlet" method="post">
<div style="padding:10px;">Username: 
<input type="text" name="user_name"/></div>
<div style="padding:10px;">
Password:
<input type="password" name="user_password"/></div><br/>
<button type="submit">login</button>
</form>
</div>

</body>
</html>