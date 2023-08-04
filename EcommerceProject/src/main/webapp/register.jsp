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
	<div class="d-flex justify-content-center my-5">
		<div class="card w-50 border-bottom text-info">
			<div class="card-body">
				<form action="Register" method="post">
				<h1 class="text-center">Sign Up Here</h1>
					<div class="form-group">
						<label for="formGroupExampleInput"><b>Enter UserName</b></label> <input
							type="text" class="form-control" id="formGroupExampleInput"
							placeholder="Enter UserName" name="user_name">
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput2"><b>Enter Email</b></label> <input
							type="text" class="form-control" id="formGroupExampleInput2"
							placeholder="Enter Email" name="user_email">
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput"><b>Enter Password</b></label> <input
							type="text" class="form-control" id="formGroupExampleInput"
							placeholder="Enter Password" name="user_password">
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput2"><b>Enter PhoneNumber</b></label> <input
							type="text" class="form-control" id="formGroupExampleInput2"
							placeholder="Enter PhoneNumber" name="user_phone">
					</div>
					<div class="form-group">
						<label for="formGroupExampleInput2"><b>Enter Address</b></label> <textarea
							type="textarea" class="form-control" id="formGroupExampleInput2"
							placeholder="Enter Address" name="user_address"></textarea>
					</div>
					<div class="text-center">
					<button class="btn btn-outline-success m-2" type="submit">Register</button>
					<button class="btn btn-outline-primary" type="reset">Reset</button>
					</div>
					
					
				</form>
			</div>
		</div>
	</div>
</body>
</html>

