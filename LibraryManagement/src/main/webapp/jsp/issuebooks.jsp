<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Issue</title>
<link rel="stylesheet" type="text/css" href="css/welcome_head.css">
</head>
<body>
<div class="header_wel">
<h1>Books Transfer</h1> 
</div>
 <br><br>
<form action="issuebooks" method="post">  
<table align="center">  
  <tr><td>Uid:</td><td><input type="text" name="uid"/></td></tr>  
  <tr><td>Book Id:</td><td><input type="text" name="book_id"/></td></tr> 
  <tr><td>Reader UId:</td><td><input type="text" name="r_uid"/></td></tr>
  <tr><td>IssueDate:</td><td><input type="text" name="issuedate" placeholder="yy-mm-dd"/></td></tr> 
  <tr><td>EndDate:</td><td><input type="text" name="enddate" placeholder="yy-mm-dd"/></td></tr> 

<tr><td colspan="2"><br><input type="submit" class="button" value="SaveRecord"/></td></tr>  
</table>  
</form>  
</body>
</html>