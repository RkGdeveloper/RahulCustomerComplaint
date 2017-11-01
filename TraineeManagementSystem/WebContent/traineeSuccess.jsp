<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
	<table align = "center">
			<tr><td colspan = "2"><h1>Trainee Information.</h1></td></tr>
			
			<tr><td>Trainee Id:</td><td>${k.traineeId}</td></tr>
			<tr><td>Trainee Name:</td><td>${k.traineeName}</td></tr>
			<tr><td>Trainee City:</td><td>${k.traineeCity}</td></tr>
			<tr><td>Trainee Domain:</td><td>${k.traineeDomain}</td></tr>
			
	</table>
</body>
</html>