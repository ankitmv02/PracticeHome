<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<script type="text/javascript">
	function addEmp() 
	{
		alert("Add Function");
		document.MyForm.action="add";
		document.MyForm.submit();
	}
	
	function deleteEmp() 
	{
		alert("Delete Function");
		document.MyForm.action="delete";
		document.MyForm.submit();
	}
	function editEmp() 
	{
		alert("Update Function");
		document.MyForm.action="edit";
		document.MyForm.submit();
	}
	</script>
</head>
<body>
<h1 style="color:purple" align="center">Complete Information</h1>
	<form name="MyForm">
		<table border="1" align="center">
			<th>Sr No</th>
			<th>Id</th>
			<th>Name</th>
			<th>UserName</th>
			<th>Password</th>
			<th>Mobile No</th>
			<th>Address</th>
			<tr>
				<c:forEach items="${data}" var="stu"><br>
					<td><input type="radio" name="sid" value="${stu.sid}"></td>
					<td>${stu.sid}</td>
					<td>${stu.name}</td>
					<td>${stu.username}</td>
					<td>${stu.password}</td>
					<td>${stu.mobno}</td>
					<td>${stu.address}</td>
			</tr>
			</c:forEach>
		</table>
	<table border="2" align="center">
		<tr>
			<td><input type="button" value="EDIT" onclick="editEmp()"></td>
			<td><input type="button" value="ADD" onclick="addEmp()"></td>
			<td><input type="button" value="DELETE" onclick="deleteEmp()"></td>
		</tr>
	</table>
</form>
</body>
</html>