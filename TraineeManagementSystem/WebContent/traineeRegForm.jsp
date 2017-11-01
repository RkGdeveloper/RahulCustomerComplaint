<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="main.css"/>
</head>
<body>
	<form:form action = "reg.obj" modelAttribute="trainee">
			<table align = "center">
			
			<tr><td colspan = "2"><h1 align = "center">Registration Form</h1></td></tr>
				<tr>
				<td>Trainee Id:</td>
				<td>
					<form:input path = "traineeId"/>
					<form:errors path = "traineeId"/>
				</td>
			</tr>
			
			<tr>
				<td>Trainee Name:</td>
				<td>
					<form:input path = "traineeName"/>
					<form:errors path = "traineeName"/>
				</td>
			</tr>
			
			<tr>
				<td>Trainee City:</td>
				<td>
					<form:input path = "traineeCity"/>
					<form:errors path = "traineeCity"/>
				</td>
			</tr>
			
			<tr>
				<td>Trainee Domain:</td>
				<td>
					<form:input path = "traineeDomain"/>
					<form:errors path = "traineeDomain"/>
				</td>
			</tr>
			
			<tr>
				<td></td>
				<td>
					<input type = "submit" value = "submit"/>
				</td>
			</tr>
			
			</table>
		</form:form>
</body>
</html>