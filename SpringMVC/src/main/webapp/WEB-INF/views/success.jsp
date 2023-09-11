<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
<h1>${Header}</h1>
<p>${Desc}</p>
<h1 style="color:green">${msg}</h1>
<hr>
<h1>Welcome ,${user.username}</h1>
<h1>your email is ${user.email}</h1>
<h1>your password is ${user.password}</h1>
</body>
</html>