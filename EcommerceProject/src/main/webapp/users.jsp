<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="cgg.ecom.dao.UserDao"%>
<%@page import="java.util.List"%>
<%@page import="cgg.ecom.entities.Users"%>
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
				UserDao u = new UserDao();
				List<Users> l = u.getAllUsers();
				
				
				for (Users item : l) {
				%>
			<div class="col-4">
				<div class="card my-5">

  					<div class="card-body">
   						 <div class="text-center">
   						 <img class="card-img-top w-25 h-25" src="images/user.png" alt="Card image cap">
   						 </div>
						<h5 class="card-title text-center text-capitalize mt-2"><%=item.getUserName()%></h5>
						<p class="card-text"><b>Id : </b><%=item.getUserId()%></p>
						<p class="card-text"><b>Name : </b><%=item.getUserName()%></p>
						<p class="card-text"><b>Email : </b><%=item.getUserEmail()%></p>
						<p class="card-text"><b>Password : </b><%=item.getUserPassword()%></p>
						<p class="card-text"><b>Phone : </b><%=item.getUserPhone()%></p>
						<p class="card-text"><b>Address : </b><%=item.getUserAddress()%></p>
						<p class="card-text"><b>Type : </b><%=item.getUserType()%></p></div>
					</div>
				</div>
			
				<%
	}
	%>
		</div>
	</div>

</body>
</html>