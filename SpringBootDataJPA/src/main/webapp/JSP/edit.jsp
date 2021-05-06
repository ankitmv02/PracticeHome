<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
<h1 style="color:Orange" align="center">EDIT DATA</h1>

<form action="update">
	<table border="2" cellspacing="6" align="center">
		<tr>
			<td>Id:=</td>
			<td><input type="hidden" name="sid" value="${data.sid}"></td>
		</tr>
		<tr>
			<td>Name:-</td>
			<td><input type="text" name="name" value="${data.name}"></td>
		</tr>
		
		<tr>
			<td>Address:-</td>
			<td><input type="text" name="address" value="${data.address}"></td>
		</tr>
		
		<tr>
			<td>Mobile No:-</td>
			<td><input type="text" name="mobno" value="${data.mobno}"></td>
		</tr>
		
		<tr>
			<td>User Name:-</td>
			<td><input type="text" name="username" value="${data.username}"></td>
		</tr>

		<tr>
			<td>Password:-</td>
			<td><input type="text" name="password" value="${data.password}"></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="UPDATE"></td>
		</tr>
	</table>
</form>
</body>
</html>