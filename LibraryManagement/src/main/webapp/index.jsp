<html>
<head>
<title>LibraryManagementSystem</title>
<!-- <script type="text/javascript" src="/js/loginvalidate.js"></script> -->
<link rel="stylesheet" type="text/css" href="css/header_style.css">
<script type="text/javascript">
function validateForm() {
	  var x = document.forms["myForm"]["uname"].value;
	  var y = document.forms["myForm"]["pwd"].value;
	  if (x == "") {
	    alert("UserName must be filled out");
	    return false;
	  }
	  else if (y == "")
		  {
			    alert("Password must be filled out");
			    return false;
		  }
	}
</script>
</head>
<body>
<div class="header">
<h1>LibrarySystemManagement</h1>
</div>
<div class="loginbox">
<form name="myForm" action="getLogin" onsubmit="return validateForm()" method="post">
<table align="center">
 <tr><td>UserName</td><td><input type="text" name="uname"></td></tr>
 <tr><td>Password</td><td><input type="password" name="pwd"></td></tr>
</table>
<br><br>
<center>
<input type="submit" class="button" value="Submit">
</center>
</form>
</div>

<div class="footer">
<h1>www.techouts.com</h1>
</div>
</body>
</html>
