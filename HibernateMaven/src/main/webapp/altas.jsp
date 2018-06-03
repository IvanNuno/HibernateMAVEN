<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<meta charset="utf-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<title>Pagina de altas</title>
</head>
<body>

	<main class="container">
		<div class="jumbotron">
			<form action="CreateServlet" method="post">
					<div class="form-group">
						<p> <label for="txtNombre">Nombre: </label>
						<input class="form-control" type="text" id="txtNombre" name="txtNombre"> </p>
					</div>
					<div class="form-group">
						<p> <label for="txtApellido">Apellido: </label>
						<input class="form-control" type="text" id="txtApellido" name="txtApellido"> </p>
					</div>
					<div class="form-group">
						<p> <label for="txtCuarto">Cuarto: </label>
						<input class="form-control" type="text" id="txtCuarto" name="txtCuarto"> </p>
					</div>
					<p> <input  class="btn-primary" type="submit" value="Dar de Alta"> </p>
			</form>
		</div>
	</main>
	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	
</body>
</html>