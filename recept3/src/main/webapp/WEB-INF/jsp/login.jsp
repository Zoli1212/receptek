<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Új hozzávaló</title>
</head>
<body>
	<span style="color: red">${errorMsg }</span>
	<form action="/login" method="post">
		<input type="hidden" name="redirectUrl" value="${redirectUrl }"/>
		<span>Felhasználó név: </span> <input name="name" type="text" /><br>
		<span>Jelszó: </span> <input name="password" type="text" />
		<button type="submit">Elküld</button>
	</form>
</body>
</html>