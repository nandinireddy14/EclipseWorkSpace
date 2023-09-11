<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="cgg.ecom.dao.CategoryDao" %>
<%@ page import="cgg.ecom.entities.Category" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String current_user=(String) session.getAttribute("current_user");
String username=(String) session.getAttribute("username");
%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand text-info" href="#">My Cart</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
      <li class="nav-item active">
        <a class="nav-link text-info" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
       <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle text-info" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         Categories
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
									<%
									CategoryDao c=new CategoryDao();
									List<Category> l=c.getAllCategory();
									
									for(Category s:l)
									{%>
										          <a class="dropdown-item" href="index.jsp?category=<%= s.getCategoryName()%>"><%= s.getCategoryName() %></a>
										
										<% 
									}
									%>
        
        
        
        </div>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
    <button class="btn btn-outline-info my-2 my-sm-0"><i class="fa-solid fa-cart-shopping"></i></button>
    <%
    if(current_user==null)
    { %>
      <a href="login.jsp" class="btn btn-outline-info my-2 my-sm-0 m-2">Login</a>
      <a href="register.jsp" class="btn btn-outline-info my-2 my-sm-0">Register</a>
      <%}
    else{
    	%>
    	
    	<a href="#" class="btn btn-outline-info my-2 my-sm-0"><%= username %></a>
      <a href="Logout" class="btn btn-outline-info my-2 my-sm-0">Logout</a>
      
    <% 	
    }
    %>
      
    </form>
  </div>
</nav>


</body>
</html>