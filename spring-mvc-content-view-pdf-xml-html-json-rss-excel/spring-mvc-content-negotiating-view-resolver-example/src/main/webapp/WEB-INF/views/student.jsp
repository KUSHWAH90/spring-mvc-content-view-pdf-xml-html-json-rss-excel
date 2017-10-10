<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SANTOSH</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<h2>Content Viewer</h2>
<div class="col-sm-6">
	<table class="table">

		<tr class="warning">
			<th>ID</th>
			<th>FIRSTNAME</th>
			<th>LASTNAME</th>
			<th>B'DAY</th>
			<th>ADDRESS</th>
			<th>CITY</th>
			<th>MOILE</th>
			<th>EMAIL</th>
			<th>PINCODE</th>
		</tr>
		<c:forEach var="i" items="${student}">
			<tr class="info">
				<td>${i.id}</td>
				<td>${i.firstname}</td>
				<td>${i.lastname}</td>
				<td>${i.dob}</td>
				<td>${i.address}</td>
				<td>${i.city}</td>
				<td>${i.mobile}</td>
				<td>${i.email}</td>
				<td>${i.pincode}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>