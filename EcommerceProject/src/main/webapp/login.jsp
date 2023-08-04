<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="components/common_css.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="components/navbar.jsp" %>
	<div class="d-flex justify-content-center my-5">
		<div class="card w-25">
			<div class="card-body">
			<%@ include file="components/message.jsp" %>
			<%@ include file="components/validmsg.jsp" %>
				<form action="Login" method="post">
				<h4 class="text-center my-2">LOGIN</h4>
					<input
							type="text" class="form-control m-2" id="formGroupExampleInput"
							placeholder="Enter Email" name="user_email">
					<input
							type="text" class="form-control m-2" id="formGroupExampleInput2"
							placeholder="Enter Password" name="user_password">
					<span class="text-right text-danger mx-2"><a href="#">Forgot?</a></span>
					<div class="text-center">
					<button class="btn btn-outline-success" type="submit">Login</button>
					
					</div>
					
					<p><a href="register.jsp">Don't have an account? Register here</a></p>
					
				</form>
			</div>
		</div>
	</div>
</body>
</html>

