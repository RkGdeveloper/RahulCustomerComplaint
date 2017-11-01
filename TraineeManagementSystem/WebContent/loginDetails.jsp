<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="main.css"/>
</head>
<body>
<form action = "checkLogin.obj">
	<table align = "center">
		<tr>
			<td>User-name</td>
			<td><input type = "text" name = "username"/></td>
		</tr>

<c:if test="${name!= null}">
		<tr>
			<td></td>
		<td>
	<font color='red' size="2px">
			<c:out value="${name}"></c:out>
	
	</font>
		</td>
		</tr>
</c:if>	
		
		
		<tr>
			<td>Password</td>
			<td><input type = "text" name = "password"/></td>	
		</tr>
		
		
<c:if test="${pass!= null}">
		<tr>
			<td></td>
			<td>
	<font color='red' size="2px">
	
				<c:out value="${pass}"></c:out>
	
	</font>
			</td>
		</tr>
</c:if>		



		
		
		<tr>
			<td></td>
			<td><input type = "submit" value = "LogIn"/></td>
		</tr>
	</table>
</form>


<c:if test="${msg!= null}">
		<tr>
			<td></td>
			<td>
	<font color='red' size="2px">
	
				<c:out value="${msg}"></c:out>
	
	</font>
			</td>
		</tr>
</c:if>	


</body>
</html>