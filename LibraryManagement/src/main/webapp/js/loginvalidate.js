
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
