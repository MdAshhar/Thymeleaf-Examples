<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Data</title>
</head>
<body>
	<form action="savedata" method="post">
		<h2>Create Data</h2>
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" name="age"/></td>
			</tr>
			<tr>
				<td>Section</td>
				<td><input type="text" name="section"/></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="save"/></td>
			</tr>
		</table>
	</form>

</body>
</html>