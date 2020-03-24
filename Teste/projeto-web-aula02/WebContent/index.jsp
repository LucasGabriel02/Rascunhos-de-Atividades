<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Projeto Web </title>
</head>
<body>
	<div align="center">
		<form action="cadastroServlet" method="get">
			Nome: <input id="nome" name="nome" type="text"/></br></br>
			E-mail:<input id="email" name="email" type="email" />
			</br>
			</br>
			<button id="btn-enviar" name="btn-enviar" type="submit" value="Enviar">Enviar</button>
			<button id="btn-limpar" name="btn-limpar" type="reset" value="Limpar">Limpar</button>
		</form>
	</div>
</body>
</html>
