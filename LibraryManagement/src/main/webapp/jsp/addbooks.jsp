<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Record Entry</title>
<link rel="stylesheet" type="text/css" href="css/welcome_head.css">
</head>
<body>
<div class="header_wel">
<h1>Add New Books</h1>
</div>
  <br><br>
<form action="SaveBooks" method="post">  
<table align="center">  
  <tr><td>BookId:</td><td><input type="text" name="book_id"/></td></tr>  
  <tr><td>Name:</td><td><input type="text" name="name"/></td></tr> 
  <tr><td>Auther:</td><td><input type="text" name="auther"/></td></tr> 

<tr><td colspan="2"><br><input type="submit" class="button" value="Save Book"/></td></tr>  
</table>  
</form>  
</body>
</html>