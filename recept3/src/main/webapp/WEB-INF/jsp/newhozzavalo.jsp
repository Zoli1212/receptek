<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Új hozzávaló</title>
</head>
<body>
	<form action="" method="post">
		<input type="hidden" name="rid" value="${rid}">
		<span>Hozzávaló neve: </span> <input name="name" type="text" /><br>
		<button type="submit">Elküld</button>
	</form>
</body>
</html>