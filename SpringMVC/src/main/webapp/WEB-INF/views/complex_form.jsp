<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
	
	<link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet"/>
	<script src="<c:url value='/resources/js/script.js' />"></script>

	
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
	crossorigin="anonymous"></script>
</head>
<body style="background:#e2e2e2;">
<img src="<c:url value='/resources/images/rose.jpg'/>" alt="Rose" />
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
					<div class="alert alert-danger" role="alert">
						<form:errors path="student.*"/>
					</div>
				
					
					
					
						<h3 class="text-center">Complex Form</h3>
						<form action="handleForm" method="post">

							<div class="form-group mb-3">
								<label for="name" class="form-label">Your Name</label> <input
									type="text" id="name" placeholder="Enter Name"
									class="form-control" name="name" />
							</div>

							<div class="form-group mb-3">
								<label for="id" class="form-label">Your Id</label> <input
									type="text" id="id" placeholder="Enter Id" class="form-control"
									name="id"/>
							</div>

							<div class="form-group mb-3">
								<label for="text" class="form-label">Enter Your Date of
									Birth</label> <input type="date" id="date" placeholder="dd/mm/yyyy"
									class="form-control" name="dob" />
							</div>

							<div class="form-group mb-3">
								<label for="course" class="form-label">Select Courses</label> <select
									class="form-select" name="course" multiple>
									<option value="1" selected>Java</option>
									<option value="2">Python</option>
									<option value="3">C</option>
									<option value="4">C++</option>
									<option value="5">Django</option>
									<option value="6">SpringFramework</option>
								</select>
							</div>
							<div class="form-group mb-3">
								<span>Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio1" value="male"> <label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female"> <label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>
							</div>
							
							<div class="form-group mb-3">
								<label for="type" class="form-label">Select Type</label> <select
									class="form-select" name="type" id="type">
									<option value="oldStudent" selected>Old Student</option>
									<option value="normalStudent">Normal Student</option>
								</select>
							</div>
							
							
							<div class="card p-4">
							<p>Your Address</p>
							<div calss="card-body">
							
							
							<div class="form-group mb-3">
							<label for="street" class="form-label">Your Street</label>
							<input type="text" id="street" placeholder="Enter Street" name="address.street" class="form-control"/>
							
							</div>
							<div class="form-group mb-3">
							<label for="city" class="form-label">Your City</label>
							<input type="text" id="city" placeholder="Enter City" name="address.city" class="form-control"/>
							
							</div>
							</div>
							</div>
							
							<div class="text-center my-2"><button class="btn btn-outline-primary">Submit</button></div>
						</form>
					</div>


				</div>
			</div>
		</div>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-Rx+T1VzGupg4BHQYs2gCW9It+akI2MM/mndMCy36UVfodzcJcF0GGLxZIzObiEfa"
		crossorigin="anonymous"></script>
</body>
</html>