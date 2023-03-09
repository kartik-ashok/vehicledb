<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addVehicle">
<input type="text" name="vid" placeholder="vehcile id"><br><br>
<input type="text" name="vname" placeholder="vehcile name"><br><br>
<input type="text" name="vcolor" placeholder="vehcile color"><br><br>
<input type="text" name="vyear" placeholder="vehcile year"><br><br>
<input type="submit">
</form>

				<!-- Enter Id for getting a details -->
				<h1>-------Enter Id for getting a details-------</h1>
				<form action="getById">
				<input type="text" name="vid" placeholder="enter VId">
				<input type="submit">
				</form>
				<h1>${value}</h1>
				
				
				<!-- Enter Id for getting a details -->
				<h1>-------Enter color for getting a details-------</h1>
				<form action="getByColor">
				<input type="text" name="vcolor" placeholder="enter vehicle color">
				<input type="submit">
				</form>
				<h1>${value1}</h1>
				
				<!-- Enter name for getting a details -->
				<h1>-------Enter Brand for getting a details-------</h1>
				<form action="getByName">
				<input type="text" name="vname" placeholder="enter vehicle color">
				<input type="submit">
				</form>
				<h1 style="color: red">${value2}</h1>
</body>
</html>