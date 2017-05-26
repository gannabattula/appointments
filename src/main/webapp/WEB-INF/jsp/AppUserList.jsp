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
    window.location.href="/appointments/appUser/registrationForm"
    
}

function editUser(appUserId) {
    window.location.href="/appointments/appUser/" + appUserId;
    
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
<th>Id </th> <th>Name </th>
</tr>

<c:forEach items="${users}" var="object">
      <tr>
        <td>${object.appUserId}</td>
        <td>${object.userName}</td>
        <td>-----</td>
        <td> <input type="button" value="Edit" onclick="editUser(${object.appUserId})" > </td>
      </tr>
     </c:forEach>

</table>

</body>
</html>