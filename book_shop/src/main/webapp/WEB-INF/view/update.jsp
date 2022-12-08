<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<h2>UPDATE DATA</h2>
		<form action="updateData" method="post">
		<table>
			<tr>
				<td><input type="hidden" name="id" value="${page.id}"/></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="${page.name}"/></td>
			</tr>
			<tr>
				<td>Writer</td>
				<td><input type="text" name="writer" value="${page.writer}"/></td>
			</tr>
			<tr>
				<td>Content</td>
				<td><input type="text" name="content" value="${page.content}"/></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price" value="${page.price}"/></td>
			</tr>
			<tr>
				<td><input type="Submit" value="Update"/></td>
			</tr>
		</table>
	</form>
</body>
</html>