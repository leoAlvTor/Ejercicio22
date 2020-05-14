<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	
	<c:forEach var="compras" items="${cliente.compraslList}">
	
		<h1>Compra</h1>
		<c:forEach var="libros" items="${compras.libroList}">
		<h2>Articulos: ${libros.edicion }</h2>
		<h2>Articulos: ${libros.autor }</h2>
		</c:forEach>
		<h2>Total: ${compras.total}</h2>
		

	</c:forEach>


</body>
</html>