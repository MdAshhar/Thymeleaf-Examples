<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Book</title>
</head>
<body>	
	<h2>All Book Data</h2>
		<table border="">
			<tr>
				<th>Name</th>
				<th>Writer</th>
				<th>Content</th>
				<th>Price</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>
			<c:forEach var="reads" items="${read}">
				<tr>
					<td>${reads.name}</td>
					<td>${reads.writer}</td>
					<td>${reads.content}</td>
					<td>${reads.price}</td>
					<td><a href="deleteOneData?id=${reads.id}">Delete</a></td>
					<td><a href="updateOneData?lallu=${reads.id}">Update</a></td>
				</tr>
			</c:forEach>
		</table>

</body>
</html>