<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Form</h1>
	<div class="ex">
		<form action="RegistrationController" method="post">
			<table style="with: 50%">
				<tr>
					<td>User Name</td>
					<td><input type="text" name="User Name" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="text" name="Gender" /></td>
					<form action="">
                     <input type="radio" name="Gender" value="male"> Male<br>
                     <input type="radio" name="Gender" value="female"> Female<br>
                     <input type="radio" name="Gender" value="other"> Other
                    </form>	
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age" /></td>
				</tr>
				<tr>
					<td>Address1</td>
					<td><input type="text" name="Address1" /></td>
				</tr>
				<tr>
					<td>Address2</td>
					<td><input type="text" name="Address2" /></td>
				</tr>
				<tr>
					<td>Area</td>
					<td><input type="text" name="Area" /></td>
				</tr>
				<tr>
					<td>Vicinity area</td>
					<td><input type="text" name="Vicinity area" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="City" /></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" name="State" /></td>
				</tr>
				<tr>
					<td>Pin</td>
					<td><input type="text" name="Pin" /></td>
				</tr>
				<tr>
					<td>User ID</td>
					<td><input type="text" name="User ID" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="Password" /></td>
				</tr>
			</table>
			<input type="submit" value="register" />
		</form>
	</div>

</body>
</html>