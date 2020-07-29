<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Új recept</title>
</head>
<body>
	<form action="" method="post">
		<span>Recept neve: </span> <input name="name" type="text" /><br>
		<span>Előkészítési idő: </span> <input name="prepTime" type="number" /><br>
		<span>Elkészítési idő: </span> <input name="cookTime" type="number" /><br>
		<span>Megjegyzés: </span> <input name="komment.msg" type="text" /><br>
		<button type="submit">Elküld</button>
	</form>
</body>
</html>