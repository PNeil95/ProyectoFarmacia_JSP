
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
				

				<div class="container">
					<h1>Listado de</h1>

					<a class="btn btn-primary" href="#">Ver data</a> <a
						class="btn btn-primary" href="#">Registra</a>
				</div>

				<br> <br>

				<div class="container">
					<table class="table">

						<tr>
							<th>Id</th>
							<th>Nombre</th>
							<th></th>
							<th></th>
							<th></th>
							<th></th>
						</tr>

						<tr class="grilla_campo">
							<td>AAAA</td>
							<td>BBBB</td>
							<td>CCCC</td>
							<td>DDDD</td>
							<td></td>
							<td></td>
						</tr>


					</table>
				</div>
			</section>
		</main>
		<footer> </footer>
	</div>

</body>
</html>