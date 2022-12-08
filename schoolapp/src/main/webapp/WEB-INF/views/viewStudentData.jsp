<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ViewStudentData</title>
</head>
<body>
	<h2>viewStudentData</h2>
	<table border=1>
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Section</th>
			<th>Mobile</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="stud" items="${stud}">
			<tr>
				<td>${stud.name}</td>
				<td>${stud.age}</td>
				<td>${stud.section}</td>
				<td>${stud.mobile}</td>
				<td><a href="deletedata?bota=${stud.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>