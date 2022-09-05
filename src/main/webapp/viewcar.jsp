<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Management</title>
</head>
<body style="background-image: url(images/car.jpg)">
<form action="viewCar" method="get">
		Enter Car Id:<input type = "text" name = "id"><br>
		<input type="submit" value="VIEW CAR">
	</form>
	<form action="viewAllCar" method="get">
		
		<input type="submit" value="VIEW ALL CAR">
	</form>
</body>
</html>