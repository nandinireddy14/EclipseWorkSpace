<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="components/common_css.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	
	
	<div class="bg-info h-100">
	<%@include file="components/message.jsp"%>
		<div class="container p-4">
			<div class="row ">
				<div class="col-md-4">
					<div class="card my-3" style="width: 20rem;">
						<div class="card-body text-center p-4">
							<div class="text-center">
								<img src="images/users.png" class="p-4 h-50 w-50" />
							</div>
							<a href="users.jsp" class="text-decoration-none"><h5
									class="card-title ">Users</h5></a>
							<p class="card-text">0</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="card my-3" style="width: 20rem;">
						<div class="card-body text-center p-4">
							<div class="text-center">
								<img src="images/lists.png" class="p-4 h-50 w-50" />
							</div>
							<a href="users.jsp" class="text-decoration-none"><h5
									class="card-title ">Categories</h5></a>
							<p class="card-text">0</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="card my-3" style="width: 20rem;">
						<div class="card-body text-center p-4">
							<div class="text-center">
								<img src="images/products.png" class="p-4 h-50 w-50" />
							</div>
							<a href="users.jsp" class="text-decoration-none"><h5
									class="card-title ">Products</h5></a>
							<p class="card-text">0</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="card my-3" style="width: 20rem;">
						<div class="card-body text-center p-4">
							<div class="text-center">
								<img src="images/add_users.png" class="p-4 h-50 w-50" />
							</div>
							<h5 class="card-title ">Add Users</h5>
							<div>
								<button type="button" class="btn btn-primary w-50 my-1"
									data-toggle="modal" data-target="#exampleModal"
									data-whatever="@getbootstrap">Click Here</button>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="card my-3" style="width: 20rem;">
						<div class="card-body text-center p-4">
							<div class="text-center">
								<img src="images/add_categories.png" class="p-4 h-50 w-50" />
							</div>
							<h5 class="card-title ">Add Categories</h5>
							<div>
								<button type="button" class="btn btn-primary w-50 my-1"
									data-toggle="modal" data-target="#exampleModal1"
									data-whatever="@getbootstrap">Click Here</button>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="card my-3" style="width: 20rem;">
						<div class="card-body text-center p-4">
							<div class="text-center">
								<img src="images/plus.png" class="p-4 h-50 w-50" />
							</div>
							<h5 class="card-title ">Add Products</h5>
							<div>
								<button type="button" class="btn btn-primary w-50 my-1"
									data-toggle="modal" data-target="#exampleModal2"
									data-whatever="@getbootstrap">Click Here</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Fill the
						Details</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="Adding" method="post">
						<div class="form-group">
							<label for="formGroupExampleInput"><b>Enter UserName</b></label>
							<input type="text" class="form-control"
								id="formGroupExampleInput" placeholder="Enter UserName"
								name="user_name">
						</div>
						<div class="form-group">
							<label for="formGroupExampleInput2"><b>Enter Email</b></label> <input
								type="text" class="form-control" id="formGroupExampleInput2"
								placeholder="Enter Email" name="user_email">
						</div>
						<div class="form-group">
							<label for="formGroupExampleInput1"><b>Enter Password</b></label>
							<input type="text" class="form-control"
								id="formGroupExampleInput1" placeholder="Enter Password"
								name="user_password">
						</div>
						<div class="form-group">
							<label for="formGroupExampleInput3"><b>Enter
									PhoneNumber</b></label> <input type="text" class="form-control"
								id="formGroupExampleInput3" placeholder="Enter PhoneNumber"
								name="user_phone">
						</div>
						<div class="form-group">
							<label for="formGroupExampleInput4"><b>Enter Address</b></label>
							<textarea type="text" class="form-control"
								id="formGroupExampleInput4" placeholder="Enter Address"
								name="user_address"></textarea>
						</div>
			
				<div class="modal-footer">
					<button type="submit" class="btn btn-primary" name="adding"
						value="add_user">Submit</button>
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>

				</div>
				</form>
					</div>
			</div>
		</div>
	</div>

	<div class="modal fade" id="exampleModal1" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel1" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel1">Fill the
						Details</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form>
						<div class="form-group">
							<label for="formGroupExampleInput5"><b>Category Name</b></label>
							<input type="text" class="form-control"
								id="formGroupExampleInput5" placeholder="Enter Category Name"
								name="category_name">
						</div>
						<div class="form-group">
							<label for="formGroupExampleInput6"><b>Category
									Description</b></label>
							<textarea type="text" class="form-control"
								id="formGroupExampleInput6" placeholder="Enter Category
									Description"
								name="category_description"></textarea>
						</div>
				
				<div class="modal-footer">
					<button type="button" class="btn btn-primary">Submit</button>
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>

				</div>
				</form>
			</div>
			</div>
		</div>
	</div>

	<div class="modal fade" id="exampleModal2" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel2" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel2">Fill the
						Details</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form>
						<div class="form-group">
							<label for="formGroupExampleInput7"><b>Product Name</b></label> <input
								type="text" class="form-control" id="formGroupExampleInput7"
								placeholder="Enter Product Name" name="pro_name">
						</div>
						<div class="form-group">
							<label for="formGroupExampleInput8"><b>Product
									Descripiton</b></label> <input type="text" class="form-control"
								id="formGroupExampleInput8"
								placeholder="Enter Product Descripiton" name="pro_description">
						</div>
						<div class="form-group">
							<label for="formGroupExampleInput9"><b>Product Price</b></label>
							<input type="text" class="form-control"
								id="formGroupExampleInput9" placeholder="Enter Product Price"
								name="pro_price">
						</div>
						<div class="form-group">
							<label for="formGroupExampleInput10"><b>Discount in
									number</b></label> <input type="text" class="form-control"
								id="formGroupExampleInput10"
								placeholder="Enter Discount in number" name="pro_discount">
						</div>
						<div class="form-group">
							<label for="formGroupExampleInput11"><b>Product
									Quantity</b></label>
							<textarea type="textarea" class="form-control"
								id="formGroupExampleInput11"
								placeholder="Enter Product Quantity" name="pro_quantity"></textarea>
						</div>
						<div class="form-group">
							<label for="formGroupExampleInput12"><b>Choose
									Category</b></label> <select id="formGroupExampleInput12" name="pro_category">
								<option></option>
							</select>
						</div>
						<div class="form-group">
							<label for="formGroupExampleInput13"><b>Upload
									Product Image</b></label> <input type="file" class="form-control"
								id="formGroupExampleInput13" placeholder="Enter Quantity"
								name="pro_image">
						</div>
				
				<div class="modal-footer">
					<button type="button" class="btn btn-primary">Submit</button>
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>

				</div>
				</form>
				</div>
			</div>
		</div>
	</div>




</body>
</html>