<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
function invokeRegistrationForm() {
    alert('you there')
    window.location.href="/appointments/jsp/Registration.jsp"
    
}
</script>


</head>
<body>

The current user List 

<input type="button" value="Register" onclick="invokeRegistrationForm()" > 
<table>
<tr>
<th>Id </th> <th>Name </th>
</tr>

<tr>
<td> 1 </td> <td> rama</td>
</tr>


</table>

</body>
</html>