<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/welcome_head.css">
</head>
<body>
<div class="header_wel">
<h1>Return Books</h1> 
</div>
 <br><br>
<form action="returnBooks" method="post">  
<table align="center">  
  <tr><td>Enter ReaderId:</td><td><input type="text" name="reader_uid"/></td></tr>  
 
<tr><td colspan="2"><br><input type="submit" class="button" value="ShowBooks"/></td></tr>  
</table>  
</form> 
</body>
</html>