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
   
<c:if test = "${not empty listdata}">
    <tr>
      <th>Book Id</th>
      <th>Name</th>
      <th>Auther</th>
    </tr>
   <c:forEach items="${listdata}" var="data">
     
      <tr> <td><c:out value="${data.book_id}"></c:out></td>
           <td><c:out value="${data.name}"></c:out></td>
           <td><c:out value="${data.auther}"></c:out></td>
     </tr>
     
   </c:forEach>
</c:if>
 </table>   
</body>
</html>