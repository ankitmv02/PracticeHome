<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Boot Home</title>
</head>
<body>
	
	<form action="addStudent">
		<input type="text" name="sid"><br>
		<input type="text" name="sname"><br>
		<input type="text" name="tech"><br>
		<input type="submit"><br>
	</form>
	
	<form action="getStudent">
		<input type="text" name="sid"><br>
		<input type="submit"><br>
	</form>
</body>
</html>