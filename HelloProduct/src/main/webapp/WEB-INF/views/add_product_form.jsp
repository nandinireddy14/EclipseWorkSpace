<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h4 class="text-info text-center p-4">Fill in the Details</h4>
	<div class="d-flex flex-row justify-content-center">
		<form action="handleProduct" method="post" class="w-50">
			<div class="form-group">
				<label for="productId">Product Id</label> <input type="text"
					class="form-control" id="productId" name="id"
					placeholder="Enter Id">
			</div>
			<div class="form-group">
				<label for="productName">Product Name</label> <input type="text"
					class="form-control" id="productName" name="name"
					placeholder="Enter Name">
			</div>
			<div class="form-group">
				<label for="productDesc">Product Description</label>
				<textarea type="text" class="form-control" id="productDesc"
					name="description" placeholder="Enter Description"></textarea>
			</div>
			<div class="form-group">
				<label for="productPrice">Product Price</label> <input type="text"
					class="form-control" id="productPrice" name="price"
					placeholder="Enter Price">
			</div>
			<div class="text-center">
				<a href="${pageContext.request.contextPath }"
					class="btn btn-primary">Back</a>
				<button type="submit" class="btn btn-success">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>