<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="cgg.ecom.dao.CategoryDao"%>
<%@page import="java.util.List"%>
<%@page import="cgg.ecom.entities.Category"%>
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
		CategoryDao c= new CategoryDao();
				List<Category> l = c.getAllCategory();
				for (Category item : l) {
				%>
			<div class="col-4">
				<div class="card my-5">

  					<div class="card-body">

						<h5 class="card-title text-center"><%=item.getCategoryName()%></h5>
						<p class="card-text"><b>Id : </b><%=item.getCategoryId()%></p>
						<p class="card-text"><b>Name : </b><%=item.getCategoryName()%></p>
						<p class="card-text"><b>Description : </b><%=item.getCategoryDesc()%></p>
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