<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Employee</title>
</head>
<body>
	<form action="EmployeeController" method="post">  
	<input type="text" name="firstName" value="First Name..." onclick="this.value=''"/><br/>  
	<input type="text" name="lastName"  value="Last Name..." onclick="this.value=''"/><br/>  
	<input type="text" name="dob"  value="DOB..." onclick="this.value=''"/><br/>  
	<input type="text" name="gender" value="Gender..." onclick="this.value=''"/><br/>  
	<input type="text" name="email"  value="Email..." onclick="this.value=''"/><br/>  
	<input type="text" name="mobileNumber"  value="Mobile..." onclick="this.value=''"/><br/>
	<input type="text" name="salary" value="Salary..." onclick="this.value=''"/><br/>  
	<input type="text" name="street"  value="Street..." onclick="this.value=''"/><br/>  
	<input type="text" name="city"  value="City..." onclick="this.value=''"/><br/>
	<input type="text" name="state" value="State..." onclick="this.value=''"/><br/>  
	<input type="text" name="country"  value="Country..." onclick="this.value=''"/><br/>  
	<input type="text" name="pincode"  value="Pincode..." onclick="this.value=''"/><br/>
	<input type="submit" value="Add"/>  
</form>  
</body>
</html>