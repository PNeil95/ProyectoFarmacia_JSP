<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
// validar si ha logueado
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>
	<div id="contenedor">
		<header>
			<h1>Cabecera</h1>
			<p>
				Ud se ha identificado como : <strong></strong>
			</p>
		</header>

		<main>
			<nav style="width: 25%; float: left;">
				<ul>

				</ul>
			</nav>
			<section style="width: 65%; float: left;">
				<h1>Mantenimiento de Productos</h1>
				<!-- Formulario -->
				<form action="crudprod" title="Registro al Sistema">
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputNombre">Codigo del Producto</label> <input
								type="text" class="form-control" id="inputCodigo"
								name="txtCodigo" required placeholder="Ingrese su código">
						</div>

						<div class="form-group col-md-6">
							<label for="inputApellido">Descripción</label> <input type="text"
								class="form-control" id="inputDescripcion" name="txtDescripcion"
								required placeholder="Ingrese su apellido">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-8">
							<label for="inputUsuario">Stock</label> <input type="number"
								class="form-control" id="inputStock" name="txtStock" min="1"
								required placeholder="0">
						</div>

						<div class="form-group col-md-4">
							<label for="inputContraseña">Precio</label> <input type="number"
								class="form-control" id="inputPrecio" name="txtPrecio" min="1"
								required placeholder="0.00">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-8">
							<label for="cboCategoria">Categoría</label> <select
								name="cboCategoria" class="form-control"
								id="exampleFormControlSelect">

								<option value="-1">Seleccione</option>
								<option value="1">Pastilla</option>
								<option value="2">Jarabe</option>
								<option value="3">Crema</option>
								<option value="4">Tocador</option>
								<option value="5">Cuidado</option>
								<option value="6">Otros</option>
							</select>

						</div>

						<div class="form-group col-md-4">
							<label for="cboEstado">Estado</label> <select name="cboEstado"
								class="form-control" id="exampleFormControlSelect">
								<option value="-1">Seleccione</option>
								<option value="1">Activo</option>
								<option value="2">Inactivo</option>
							</select>
						</div>
					</div>

					<button type="button" name="opcion" value="r" class="btn btn-primary">Registrar</button>
					<button type="button" name="opcion" value="a" class="btn btn-outline-secondary">Actualizar</button>
					<button type="button" name="opcion" value="e" class="btn btn-outline-success">Eliminar</button>
					<button type="button" name="opcion" value="l" class="btn btn-outline-warning">Listado</button>
				</form>
				<br>
				<p>
					Si ya tiene cuenta, Ingrese <a href="login.jsp">aquí</a>
				</p>
				${mensaje}
			</section>
		</main>
		<footer> </footer>
	</div>

</body>
</html>