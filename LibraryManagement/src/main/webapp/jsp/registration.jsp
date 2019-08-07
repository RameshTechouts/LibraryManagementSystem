<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<link rel="stylesheet" type="text/css" href="css/welcome_head.css">
 <script type="text/javascript" src="/js/loginvalidate.js"></script> 
 
 <script type="text/javascript">
function validateForm() {
	  var fname = document.forms["myForm"]["fname"].value;
	  var pwd = document.forms["myForm"]["pwd"].value;
	  var usermail = document.forms["myForm"]["usermail"].value;
	  var mobile = document.forms["myForm"]["mobile"].value;
	  var dob = document.forms["myForm"]["dob"].value;
	  var gender = document.forms["myForm"]["gender"].value;
	  
		if (fname == "") {
				alert("FirstName must be filled out");
				return false;
			} else if (pwd == "") {
				alert("Password must be filled out");
				return false;}
			else if (usermail == "") {
				alert("Email must be filled out");
				return false;}
			else if (mobile == "") {
				alert("Mobile No must be filled out");
				return false;}
			else if (dob == "") {
				alert("DOB must be filled out");
				return false;}
			else if (gender == "") {
				alert("Gender must be filled out");
				return false;}
		}
	</script>
</head>
<body>
<div class="header_wel">
<h1>Registration Form</h1>
</div>
<br><br>
 <div class="box">
<form name="myForm" action="Register" method="post" onsubmit="return validateForm()">  
  <table align="center">
 <tr><td>First Name</td><td><input type="text" name="fname"></td></tr>
 <tr><td>Last Name</td><td><input type="text" name="lname"></td></tr>
 <tr><td>Password</td><td><input type="text" name="pwd"></td></tr>
 <tr><td>Email</td><td><input type="mail" name="usermail"></td></tr>
 <tr><td>Mobile No</td><td><input type="text" name="mobile"></td></tr>
 <tr><td>DOB</td><td><input type="text" name="dob"></td></tr><br>
 <tr><td><br><input type="radio" name="gender" value="male"> Male</td>
  <td><br><input type="radio" name="gender" value="female"> Female</td></tr>
</table>

 
<br/><br/>  
<input type="submit" class="button" value="Register"/>  
  
</form>  
 </div>
</body>
</html>