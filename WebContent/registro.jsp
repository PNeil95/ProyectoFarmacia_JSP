<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="WEB-INF/css/estilo1.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div class="login-banner">
		<img alt="banner" src="img/bannercib.jpg" width="100%">
	</div>

	<div class = "container">
		<h1>Registro</h1>
		<!-- El controlador "regusu" comanda el formulario -->
		<form action="regusu" title="Registro al Sistema">
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputNombre">Nombre</label>
					<input type="text" class="form-control" id="inputNombre" name="txtNombre" required placeholder="Ingrese su nombre">
				</div>
				
				<div class="form-group col-md-6">
					<label for="inputApellido">Apellido</label>
					<input type="text"class="form-control" id="inputApellido" name="txtApellido" required placeholder="Ingrese su apellido">
				</div>
			</div>
			
			<div class="form-row">
				<div class="form-group col-md-8">
					<label for="inputUsuario">Usuario</label>
					<input type="text" class="form-control" id="inputUsuario" name="txtUsuario" required placeholder="Ingrese su correo">
				</div>
				
				<div class="form-group col-md-4">
					<label for="inputContraseña">Contraseña</label>
					<input type="password" class="form-control" id="inputContraseña" name="txtClave" maxlength="5" required placeholder="Ingrese su contraseña">
				</div>
			</div>
			
			<div class="form-group">
				<label>Fecha de Nacimiento</label>
				<input type="date" class="form-control" id="inputFecha" name="txtFecha">
			</div>
			<button type="submit" class="btn btn-primary">Registrar</button>

		</form>
		<br>
		<p>Si ya tiene cuenta, Ingrese <a href="login.jsp">aquí</a></p>
		${mensaje}
	</div>

</body>
</html>