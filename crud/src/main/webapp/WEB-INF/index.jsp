<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
	<h1>I'm a Template</h1>
	
	<table>
		<thead>
			<tr>
				<th>Expense Name</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Description</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="movie" items="${expense}">
				<tr>
					<td>${expense.name}</td>
					<td>${expense.vendor}</td>
					<td>${expense.amount}</td>
					<td>${expense.description}</td>
					<td>
						<a href="/expense/edit/${expense.id}">Edit</a>
						<form action="/movies/delete/${expense.id}" method="POST">
							<input type="submit" value="Delete"/>
						</form>
						
					</td>
				</tr>
			</c:forEach>
		</tbody>
	
	</table>
	
	
	
	
	<form:form action="/expense" method="POST" modelAttribute="expense">
		
		<div>
			<form:errors path="name"></form:errors>
			<form:input placeholder="Expense Name" path="name"></form:input>
		</div>
		
		<div>
			<form:errors path="vendor"></form:errors>
			<form:input placeholder="Vendor" path="vendor"></form:input>
		</div>
		
		<div>
			<form:errors path="amount"></form:errors>
			<form:input placeholder="Amount" type="number" path="amount"></form:input>
		</div>
		
		<div>
			<form:errors path="description"></form:errors>
			<form:input placeholder="Description" path="description"></form:input>
		</div>
		
		<input type="submit" value="Create Expense"/>
		
	</form:form>
	
	
</body>
</html>