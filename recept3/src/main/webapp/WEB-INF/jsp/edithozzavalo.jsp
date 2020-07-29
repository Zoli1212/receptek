<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Recept módosítása</title>
</head>
<body>
	<form action="" method="post">
		<input type="hidden" name="rid" value="${hozzavalo.recept.id}">
		<input type="hidden" name="id" value="${hozzavalo.id}">
		<span>Hozzávaló neve: </span> <input name="name" type="text" value="${hozzavalo.name }"/><br>
		<button type="submit">Elküld</button>
	</form>
</body>
</html>