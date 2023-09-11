<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div style="background-color: #e2e2e2; height: 90vh;">
		<h1 class="text-primary text-center p-2">Keep Notes</h1>
		<div class="d-flex flex-row justify-content-center">
			<div class="card shadow-sm w-50 my-4">
				<div class="card-body">
					<form action="saveNote" method="post">
						<div class="form-group">
							<label for="id">Id</label> <input type="number"
								class="form-control" id="id" placeholder="Enter Id"
								name="noteId">
						</div>
						<div class="form-group">
							<label for="title">Title</label> <input type="text"
								class="form-control" id="title" placeholder="Enter Title"
								name="noteTitle">
						</div>
						<div class="form-group">
							<label for="content">Content</label> <input type="text"
								class="form-control" id="content" placeholder="Enter Content"
								name="noteContent">
						</div>
						<div class="form-group">
							<label for="status">Status</label> <input type="text"
								class="form-control" id="status" placeholder="Enter Status"
								name="noteStatus">
						</div>
						<div class="text-center">
							<button class="btn btn-primary">Save Notes</button>
						</div>
					</form>
				</div>
			</div>
		</div>
		

<div class="p-4">
		<table class="table table table-striped">
			<thead>
				<tr>
					<th scope="col">Note Id</th>
					<th scope="col">Note Title</th>
					<th scope="col">Note Content</th>
					<th scope="col">Note Status</th>
					<th scope="col">CreatedAt-Day</th>
					<th scope="col">CreatedAt-Time</th>
					<th scope="col">Note Delete</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="note" items="${notes}">
					<tr>
						<th scope="row">${note.noteId}</th>
						<td>${note.noteTitle}</td>
						<td>${note.noteContent}</td>
						<td>${note.noteStatus}</td>
						<td>${note.getCreatedAt().toLocalDate()}</td>
						<td>${note.getCreatedAt().toLocalTime()}</td>
						<td>
							<form action="deleteNote" method="post">
								<input type="hidden" value="${note.noteId}" id="noteId"
									name="noteId" />
								<button class="btn btn-primary">Delete Note</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>

	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
</body>
</html>