<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL SQL Tags</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<h1>All users are:</h1>

	<sql:setDataSource driver="org.postgresql.Driver"
		url="jdbc:postgresql://localhost:5432/register" user="postgres"
		password="nandini14" var="ds" />

	<sql:query var="rs" dataSource="${ds}">select * from users;</sql:query>

	<div class="container">
		<table class="table">
			<tr>
				<td>User Id</td>
				<td>User Name</td>
				<td>User Email</td>
			</tr>
			<c:forEach items="${rs.rows}" var="row">
				<tr>
					<td><c:out value="${row.id}"></c:out></td>
					<td><c:out value="${row.name}"></c:out></td>
					<td><c:out value="${row.email}"></c:out></td>
				</tr>
			</c:forEach>


		</table>
	</div>


</body>
</html>