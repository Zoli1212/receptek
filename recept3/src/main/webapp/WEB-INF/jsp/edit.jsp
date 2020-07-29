<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Recept módosítása</title>
</head>
<body>
	<form action="/edit" method="post">
		<input type="hidden" name="id" value="${recept.id}">
		<span>Recept neve: </span> <input name="name" type="text" value="${recept.name}"/><br>
		<span>Előkészítési idő: </span> <input name="prepTime" type="number" value="${recept.prepTime}"/><br>
		<span>Elkészítési idő: </span> <input name="cookTime" type="number" value="${recept.cookTime}"/><br>
		<span>Megjegyzés: </span> <input name="komment.msg" type="text" value="${recept.komment.msg}"/><br>
		<button type="submit">Elküld</button>
	</form>
</body>
</html>