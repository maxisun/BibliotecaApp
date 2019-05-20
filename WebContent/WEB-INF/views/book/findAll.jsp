<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>FindAll</title>
	<link rel="icon" type="image/jpg" href="https://i.pinimg.com/originals/ff/1d/4a/ff1d4afcba140f7bedf19c7fa3446ca6.jpg" />
	<link rel="stylesheet" href="resources/css/main.css">
</head>
<body>
	<main id="main">
	<header>
		<h1>Hay ${numLibros} libros en existencia, de ${numAutores} cantidad de autores diferentes</h1>
	</header>
	<article id="tribute-info">
	<table id="table" border=1>
		<tr>
			<th>Titulo</th>
			<th>Autor</th>
			<th>ISBN</th>
			<th>Cantidad de existencias</th>
		</tr>
		<c:forEach items="${books}" var="books">
			<tr>
				<td>${books.title}</td>
				<td>${books.author}</td>
				<td>${books.isbn}</td>
				<td>${books.quantity}</td>
			</tr>
		</c:forEach>
	</table>
	</article>
	</main>
</body>
</html>