<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Data</title>
</head>
<body>
	<h2>Insert Data</h2>
	<form action="saveData" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>Writer</td>
				<td><input type="text" name="writer"/></td>
			</tr>
			<tr>
				<td>Content</td>
				<td><input type="text" name="content"/></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price"/></td>
			</tr>
			<tr>
				<td><input type="Submit" value="Save"/></td>
			</tr>
		</table>
	</form>
</body>
</html>