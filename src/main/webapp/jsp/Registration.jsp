<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Please Fill the form and submit to register yourself</h1>
<div class="ex">
		<form action="/appointments/appUserController" method="post">
			<table style="with: 50%">
				<tr>
					<td>User Name</td>
					<td><input type="text" name="userName" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td>
					
					<select name="gender">
						  <option value="Male">Male</option>
						  <option value="Female">Female</option>
						  <option value="Transgender">Transgender</option>
						  <option value="Not Specified">Not Specified</option>
						</select>


                     </td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age" /></td>
				</tr>
				<tr>
					<td>Address1</td>
					<td><input type="text" name="address1" /></td>
				</tr>
				<tr>
					<td>Address2</td>
					<td><input type="text" name="address2" /></td>
				</tr>
				<tr>
					<td>Area</td>
					<td><input type="text" name="area" /></td>
				</tr>
				<tr>
					<td>Vicinity area</td>
					<td><input type="text" name="vicinityArea" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" /></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" name="state" /></td>
				</tr>
				<tr>
					<td>Pin</td>
					<td><input type="text" name="pin" /></td>
				</tr>
				<tr>
					<td>User ID</td>
					<td><input type="text" name="userId" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
			</table>
			<input type="submit" value="register" />
		</form>
	</div>

</body>
</html>