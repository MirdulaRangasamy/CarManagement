<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Storage</title>
<link rel="stylesheet" href="css/style.css">
<script src="js/greet.js"></script>
</head>
<body>
	<h1>Hello Everyone</h1> 
	<%
		out.print("<h1>Welcome to Car Management</h1>");
	%>
	<a href="addCar.jsp"><button>ADD CAR</button></a>
	<a href="viewcar.jsp"><button>View CAR</button></a>
	
</body>
</html>