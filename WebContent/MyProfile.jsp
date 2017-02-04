<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Profile</title>
</head>
<body>
	<form action="EmployeeController" method="post">  
		<input type="text" id="firstName" name="firstName" value="<%=request.getAttribute("firstName")%>" onclick="this.value=''"/><br/>  
		<input type="text" id="lastName" name="lastName"  onclick="this.value=''"/><br/>  
		<input type="text" id="dob" name="dob"  onclick="this.value=''"/><br/>  
		<input type="text" id="gender" name="gender" onclick="this.value=''"/><br/>  
		<input type="text" id="email" name="email" onclick="this.value=''"/><br/>  
		<input type="text" id="mobileNumber" name="mobileNumber" onclick="this.value=''"/><br/>
		<input type="text" id="salary" name="salary" onclick="this.value=''"/><br/>  
		<input type="text" id="street" name="street" onclick="this.value=''"/><br/>  
		<input type="text" id="city" name="city" onclick="this.value=''"/><br/>
		<input type="text" id="state" name="state" onclick="this.value=''"/><br/>  
		<input type="text" id="country" name="country" onclick="this.value=''"/><br/>  
		<input type="text" id="pincode" name="pincode" onclick="this.value=''"/><br/>
		<input type="submit" value="Update"/>
	</form>
</body>
</html>