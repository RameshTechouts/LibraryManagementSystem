<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 50%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>
</head>
<body>
 <table id="customers">
   <tr>
      <th>Reader Uid</th>
      <th>Name</th>
      <th>Role</th>
      <th>Book Id</th>
      <th>Issue Date</th>
      <th>End Date</th>
     
   </tr>
<c:if test = "${not empty returnlist}">
   <c:forEach items="${returnlist}" var="returndata">
     
      <tr> <td><c:out value="${returndata.uid}" /></td>
           <td><c:out value="${returndata.name}" /></td>
           <td><c:out value="${returndata.role}" /></td>
           <td><c:out value="${returndata.book_uid}" /></td>
           <td><c:out value="${returndata.issue_date}" /></td>
           <td><c:out value="${returndata.end_date}" /></td>
     </tr>
     
   </c:forEach>
</c:if>
 </table> <br>
 <a href="deleteReturnbooks">Received Book</a>
</body>
</html>