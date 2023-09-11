<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="components/common_css.jsp"%>
    <%@page import="cgg.ecom.dao.ProductDao"%>
<%@page import="java.util.List"%>
    <%@page import="cgg.ecom.entities.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="components/navbar.jsp"%>
	<%@include file="components/common_css.jsp"%>



	<div class="container">
				

		<div class="row">
		<%
		ProductDao p = new ProductDao();
				List<Product> l = p.getAllProducts();
				for (Product item : l) {
					String path=request.getContextPath()+"/Img/"+item.getProductPic();
					System.out.println(":::::"+path);
				%>
			<div class="col-4">
				<div class="card my-5">


  					<div class="card-body">
  					<div class="text-center">
   						 <img class="card-img-top w-25 h-25" src=<%=path %> alt="Card image cap">
   						 </div>
  					
						<h5 class="card-title text-center mt-2"><%=item.getProductName()%></h5>
						<p class="card-text"><b>Id : </b><%=item.getProductId()%></p>
						<p class="card-text"><b>Name : </b><%=item.getProductName()%></p>
						<p class="card-text"><b>Description : </b><%=item.getProductDesc()%></p>
						<p class="card-text"><b>Price : </b><%=item.getProductPrice()%></p>
						<p class="card-text"><b>Discount : </b><%=item.getProductDiscount()%></p>
						<p class="card-text"><b>Quantity : </b><%=item.getProductQuantity()%></p>
						<p class="card-text"><b>Category : </b><%=item.getProductCategory()%></p>
						
</div>
					</div>
				</div>
			
				<%
	}
	%>
		</div>
	</div>

</body>
</html>