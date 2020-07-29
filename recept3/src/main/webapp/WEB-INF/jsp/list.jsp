<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Recept kezelő rendszer</title>
	</head>
	<body>
		<h1>Összes Recept</h1>
		<br>
			<table border="1">
				<thead>
					<tr>
						<th>ID</th>
						<th>Név</th>
						<th>Előkészítési idő</th>
						<th>Elkészítési idő</th>
						<th>Megjegyzés</th>
						<th>Hozzávalók</th>
						<th>Műveletek</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="recept" items="${receptek}">
					<tr>
						<th>${recept.id }</th>
						<th>${recept.name }</th>
						<td>${recept.prepTime }</td>
						<td>${recept.cookTime }</td>
						<td>${recept.komment.msg }</td>
						<td>
							<c:forEach var="hozzavalo" items="${recept.hozzavalok}">
								<a href="edit-hozzavalo?hid=${hozzavalo.id }"> <span style="color: black;"> ${hozzavalo.name } </span></a> 
								<a href="del-hozzavalo?rid=${recept.id}&hid=${hozzavalo.id }"> <span style="color: red"> X </span></a> <br>
							</c:forEach>
						</td>
						<td>
							<a href="edit?id=${recept.id}">Módosítás</a> | <a href="del?id=${recept.id}">Törlés</a> | <a href="new-hozzavalo?rid=${recept.id}">Új hozzávaló</a>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<br>
			<a href="new">Új Recept</a>
			
</body>
</html>