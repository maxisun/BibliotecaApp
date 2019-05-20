<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Bienvenido</title>
	<link rel="icon" type="image/jpg" href="https://i.pinimg.com/originals/ff/1d/4a/ff1d4afcba140f7bedf19c7fa3446ca6.jpg" />
	<link rel="stylesheet" href="resources/css/main.css">
</head>
<body>
	<main id="main">
	<header>
      <h1>Library Searcher</h1>
	</header>
	<div id="img-div">
      <figure>
       <img id="image" src="resources/images/CALLICE.gif" alt="Momo Deviluke">
       <figcaption id="img-caption">SEARCH OwO</figcaption>
      </figure>
    </div>
	<article id="tribute-info">
 		<form id="form1" action="${pageContext.request.contextPath}/bookfind" method="post"> 
		<label>Buscar: </label>
		<select name="selector">
			<option value="isbn">ISBN</option>
	    	<option value="titulo">Titulo</option>
	    	<option value="autor">Autor</option>
	    	<option value="quantity">Cantidad</option>
		</select>
		<input type="text" name="search">
		<input type="submit" value="Buscar">
	</form>
	<br>
	<form id="form2" action="${pageContext.request.contextPath}/bookfindAll" method="post"> 
		<input type="submit" value="Ver Todos">
	</form>
    </article>
	</main>
</body>
</html>