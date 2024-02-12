<!DOCTYPE html>
<html>
<head>

<title>Add Employee Form</title>
</head>
<body>
	
	<h1 style='color:aquamarine'>WELCOME TO EMPLOYEE FORM </h1>
	
		<form  action="http://localhost:8080/employees/add"  method="post">
			
			EID : <input type="number"  name="eid"> <br/>
			ENAME : <input type="text"  name="ename"> <br/>
			SALARY : <input type="number"  name="salary"> <br/>
			
			<button type="submit">Add Employee</button>
		
			
			
		</form>
	
	

</body>
</html>