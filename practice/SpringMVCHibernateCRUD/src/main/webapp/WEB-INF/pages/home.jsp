<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Employee Management Screen</title>
</head>
<body>
<div class="container-fluid">
 <div class="row">
	<div class="col-md-12">
		<h1>Employee List</h1>
		
		<table class="table">

			<th class="warning">Name</th>
			<th class="warning">Email</th>
			<th class="warning">Address</th>
			<th class="warning">Telephone</th>
			<th class="warning"></th>
			<th class="warning"></th>

			<c:forEach var="employee" items="${listEmployee}">
				<tr class="success">

					<td>${employee.name}</td>
					<td>${employee.email}</td>
					<td>${employee.address}</td>
					<td>${employee.telephone}</td>
					<td><a class="btn btn-primary" href="editEmployee?id=${employee.id}" >Edit</a></td>
						<td> <a class="btn btn-warning" href="deleteEmployee?id=${employee.id}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			New Employee Register <a href="newEmployee">here</a>
		</h4>
	</div>
	</div>
	</div>
	
</body>
</html>