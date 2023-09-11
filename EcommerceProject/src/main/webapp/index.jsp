<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="components/common_css.jsp"%>
<%@page import="cgg.ecom.entities.Product,cgg.ecom.dao.ProductDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="components/navbar.jsp"%>
	<%
	String cat = request.getParameter("category");
	System.out.println(cat);
	ProductDao p = new ProductDao();
	if (cat == null) {
		List<Product> proList = p.getAllProducts();
		if (proList.size() == 0) {
	%>

	<p>No Products to Display</p>
	<%
	} else {
	%>
		<div class="row">
			<%
			for (Product item : proList) {
				String path = request.getContextPath() + "/Img/" + item.getProductPic();
				System.out.println(":::::" + path);
			%>


			<div class="col-lg-3">
				<div class="card my-5 h-100">


					<div class="card-body">
						<div class="text-center">
							<img class="card-img-top w-25 h-25" src=<%=path%>
								alt="Card image cap">
						</div>

						<%
						int discountPrice=(int)(item.getProductPrice()*(item.getProductDiscount()/100.0));
						int finalPrice=item.getProductPrice()- discountPrice;
%>


						<h5 class="card-title text-center mt-2"><%=item.getProductName()%></h5>
						
						<p class="card-text">
							<b>Price :&#8377; <%=finalPrice %> /-  </b><span class="text-danger" style="text-decoration:line-through;">&#8377;<%=item.getProductPrice()%></span>
							<span class="text-success">(<%=item.getProductDiscount()%>% Off)</span>
							</p>
						<p class="card-text">
							<b>Description : </b><%=item.getProductDesc()%></p>
						<button class="btn btn-primary">Add to Cart</button>
						


					</div>
				</div>
			</div>
		
	<%
	}
			%>
			</div>

			<% 
	}
	} else {
	List<Product> proList = p.getProductByCategory(cat);
	if (proList.size() == 0) {
	%>

	<p>No Products to Display</p>
	<%
	} else {
	%>
		<div class="row">
			<%
			for (Product item : proList) {
				String path = request.getContextPath() + "/Img/" + item.getProductPic();
				System.out.println(":::::" + path);
			%>
			<div class="col-lg-4">
				<div class="card my-5 h-100">


					<div class="card-body">
						<div class="text-center">
							<img class="card-img-top w-25 h-25" src=<%=path%>
								alt="Card image cap">
						</div>
<%
int discountPrice=(int)(item.getProductPrice()*(item.getProductDiscount()/100.0));
int finalPrice=item.getProductPrice()- discountPrice;
%>


						<h5 class="card-title text-center mt-2"><%=item.getProductName()%></h5>
						
						<p class="card-text">
							<b>Price :&#8377; <%=finalPrice %> /-  </b><span class="text-danger text-decoration-line-through" style="text-decoration:line-through;">&#8377;<%=item.getProductPrice()%></span>
							<span class="text-success">(<%=item.getProductDiscount()%>% Off)</span>
							</p>
						<p class="card-text">
							<b>Description : </b><%=item.getProductDesc()%></p>
						<button class="btn btn-primary">Add to Cart</button>
						

					</div>
				</div>
			</div>

			<%
			}
			%>
		</div>
	<%
	}
	}
	%>

</body>
</html>