<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Apply Leaves</title>
 <!-- <link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
  <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
  <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script> -->
  
  <link rel="stylesheet" href="jquery-ui.css" />
  <script src="jquery.js"></script>
  <script src="jquery-ui.js"></script>
  <script>
$(function() {
    $( "#startDate" ).datepicker();
    $( "#endDate" ).datepicker();
});
</script>


</head>
<body>
	<form action="ApplyLeavesController" method="post">  
		<label>Apply Leaves</label>
		</br></br>
		From: <input type="text" id="startDate" name="startDate"/>
		to: <input type="text" id="endDate" name="endDate" />
		</br></br>
		<input type="submit" value="Submit"/>
		<input type="button" value="Cancel"/>
	</form>
		
		
</body>
</html>