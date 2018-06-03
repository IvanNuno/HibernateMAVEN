<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<meta charset="utf-8">
		<meta name="viewport" content="width-device-width, initial-scale=1.0">
		<title>Hibernate CRUD</title>
	</head>
	
	<body>
	<header class="container">
		<h1>Base de datos Hospital</h1>
	</header>
	<main class="container">
		<div class="container">
			<form action="altas.jsp" method="post">
				<p> <input  class="btn-primary" type="submit" value="Altas"> </p>
			</form>
		</div>
		<div class="container">
			<form action="buscar1.jsp" method="post">
				<p> <input class="btn-success" type="submit" value="Consultas"> </p>
			</form>
		</div>
		<div class="container">
			<form action="SelectAllServlet" method="post">
				<p> <input class="btn-warning" type="submit" value="Consultar Todos"> </p>
			</form>
		</div>
		<div class="container">
			<form action="actualizar.jsp" method="post">
				<p> <input class="btn-danger" type="submit" value="Modificar"> </p>
			</form>
		</div>
		<div class="container">
			<form action="eliminar.jsp" method="post">
				<p> <input class="btn-danger" type="submit" value="Eliminar"> </p>
			</form>
		</div>
	</main>
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/script.js"></script>
	</body>
	
</html>
