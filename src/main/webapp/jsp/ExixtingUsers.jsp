<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored ="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
function invokeRegistrationForm() {
    window.location.href="/appointments/jsp/Registration.jsp"
    
}

function editUser(appUserId) {
	alert('implement edit')
    //window.location.href="/appointments/appUserController"
    
}
</script>


</head>
<body>

The current user List 
<br/>
<br/>
<br/>

<input type="button" value="Register" onclick="invokeRegistrationForm()" > 
<br/><br/><br/><br/>
<table border="1" cellpadding="10" bgcolor="#oi98">
<tr>
<th>Id </th> <th>Name </th> <th>Gender </th> <th>Address1 </th>  <th>Address2 </th> <th>Area </th> <th>Vicinity Area </th>
 <th>City </th> <th>State </th> <th>Pin </th> <th>User ID </th> <th>Password </th> 
</tr>

<c:forEach items="${users}" var="object">
      <tr>
        <td>${object.appUserId}</td>
        <td>${object.userName}</td>
         <td>${object.gender}</td>
        <td>${object.address1}</td>
        <td>${object.address2}</td>
          <td>${object.area}</td>
        <td>${object.vicinityArea}</td>
        <td>${object.city}</td>
          <td>${object.state}</td>
        <td>${object.pin}</td>
        <td>${object.userId}</td>
          <td>${object.password}</td>
     <td> <input type="button" value="Edit" onclick="editUser(${object.appUserId})" > </td>
      </tr>
     </c:forEach>

</table>

</body>
</html>