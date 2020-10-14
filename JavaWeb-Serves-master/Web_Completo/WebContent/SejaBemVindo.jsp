<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> BemVindo </title>
</head>

<body>

<div align="center">
	<% String email = (String) request.getAttribute("Bem Vindo"); %>
	<p>SejaBemVindo.</p>, <%=email %> 
</div>
</body>
</html>