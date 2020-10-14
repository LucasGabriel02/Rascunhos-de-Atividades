<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> WebSite </title>
</head>
<body>
<div align="center">
	<form method="POST" action="ControllerUsuario">
	
	

		Email: <input name="email" id="email" type="email" /><br/><br/>
		Senha: <input name="senha" id="senha" type="password" /><br	/>
		<br/>
		<br/>
		<input type="submit" value="Enviar">
	</form>
	<% String msg = (String) request.getAttribute("mensagem"); %>
	<p><%=msg %></p>
</div>
</body>
</html>