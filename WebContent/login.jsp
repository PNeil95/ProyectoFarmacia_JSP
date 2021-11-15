<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema Farmacia</title>
<link rel="stylesheet" href="WEB-INF/css/estilo1.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<div class="login-banner">
		<img alt="banner" src="img/bannercib.jpg" width="100%">
	</div>

	<div class = "container">
		<h1>Acceso al Sistema</h1>
		
		<form action="" title="Acceso al Sistema">
			
			<div class="form-group">
				<label for="inputEmail">Usuario</label>
				<input type="email" class="form-control" id="inputEmail" placeholder="Ingrese su correo"> 
			</div>
			
			<div class="form-group">
				<label for="inputContraseña">Contraseña</label>
				<input type="password" class="form-control" id="inputContraseña" placeholder="Ingrese su contraseña">
			</div>
			
			<button type="submit" class="btn btn-primary">Ingresar</button>
			
		</form>
	
	</div>

</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</html>