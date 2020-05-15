<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<%-- <jsp:useBean id="cliente" scope="request" class="modelo.Cliente"></jsp:useBean>
<h1><jsp:getProperty property="correo" name="cliente"/></h1>
<h1><jsp:getProperty property="compraslList" name="cliente"/></h1> --%>

<c:set var="cliente" value="${requestScope['cliente']}"/>


	<h1>pinche Cliente: ${cliente.correo} </h1>
	
	<c:forEach var="compras" items="${cliente.compras}">
	
		<h1>Compra</h1>
		<c:forEach var="libros" items="${compras.libroList}">
		<h2>Articulos: ${libros.edicion }</h2>
		<h2>Articulos: ${libros.autor }</h2>
		<h2>Articulos: ${libros.preciofinal }</h2>
		<h2>Articulos: ${libros.titulo }</h2>
		</c:forEach>
		<h2>Total: ${compras.total}</h2>
		<h2>-----------------------------</h2>

	</c:forEach>
	<input type="button" onsubmit="/Ejercicio22/NuevaCompra" value ="terminarCompra"/>
	<a href="/Ejercicio22/NuevaCompra"> terminar compra</a>
</body>