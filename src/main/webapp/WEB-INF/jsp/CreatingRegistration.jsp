<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Please Fill the form and submit to register yourself</h1>
<div class="ex">
		<form:form action="/appointments/appUser" modelAttribute="appUser" method="post" >
			<table style="with: 50%">
				<tr>
					<td>User Name</td>
					<td><form:input type="text" path="userName" /></td>
				</tr>
			</table>
			<input type="submit" value="register" />
		</form:form>
	</div>

</body>
</html>