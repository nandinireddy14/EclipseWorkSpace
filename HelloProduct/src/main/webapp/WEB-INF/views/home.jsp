<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="./base.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container p-4">
<h4 class="text-info text-center p-4">Welcome to Product App</h4>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td><div>
      <button class="btn btn-info"><i class="bi bi-pen-fill"></i></button>
      <button class="btn btn-danger"><i class="bi bi-trash-fill"></i></button>
      
      </div></td>
    </tr>
  </tbody>
</table>

<div class="container text-center">
<a href="addProduct" class="btn btn-primary">Add Product</a>

</div>
</div>
</body>
</html>