<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add">
<table>
<tr><th>Name of the Recipe</th><th><input type=text name="name"></th></tr>
<tr><th>Date and time of its Creation</th><th><input type=text name="DateTime" placeholder="dd/MM/yyyy HH:mm"></th></tr>
<tr><th>Type of Dish</th><th><select name="TypeOfDish" >
    <option value="veg">Veg</option>
    <option value="non-veg">Non-Veg</option>
    
  </select></th></tr>
<tr><th>Serves For </th><th><input type=text name="SuitableFor"></th></tr>
<tr><th>Ingredients</th> <th><input type=text name="Ingredients"></th></tr>
<tr><th>CookingInstructions</th><th><input type=text name="CookingInstructions"></th></tr>
<tr><th><input type=submit ></th></tr>
</table>
</form>
<h3><a href="/home">Home page</a></h3>
</body>
</html>