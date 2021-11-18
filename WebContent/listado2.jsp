
<%@page import="model.Producto"%>
<%@page import="java.util.ArrayList"%>
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
					<h1>Listado de Productos</h1>

					<a class="btn btn-primary" href="crudprod?opcion=l">Ver data</a> 
					<a class="btn btn-primary" href="#">Registra</a>
				</div>

				<br> <br>

				<div class="container">
					<table class="table">

						<tr>
							<th>Producto</th>
							<th>Id</th>
							<th>Nombre</th>
							<th>Stock</th>
							<th>Precio</th>
							<th>Categoria</th>
							<th>Estado</th>
						</tr>
						<%
							//Capturar el listado enviado desde el servlet (Atributo)
							ArrayList<Producto> lstProductos = (ArrayList<Producto>)request.getAttribute("lstProductos");
							if(lstProductos != null)
							{
								for(Producto p: lstProductos)
								{%>
									<tr class="grilla_campo">
									<td><img alt="" src="img/productos/<%=p.getIdprod()%>.png" width="100px"></td>
									<td><%=p.getIdprod()%></td>
									<td><%=p.getDescripcion()%></td>
									<td><%=p.getStock()%></td>
									<td><%=p.getPrecio()%></td>
									<td>
										<a href="crudprod?opcion=q&cod=<%=p.getIdprod()%>"><img alt="" src="img/lupa.png"></td></a>
									<td></td>
									</tr>
								<% }	
							}
						%>
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
		<footer> 
		
		</footer>
	</div>

</body>
</html>