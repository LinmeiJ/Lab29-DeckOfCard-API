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
	<form action="start">
	<div class="container">
		How many decks would you like to play?
			<input type="number" name="deckCount">
		How many cards would you like to draw?
			<input type="number" name="cardsCount">
		<input type="submit" value="submit">
		
	</div>	
	<div class="container">
	
			<h3>Deck Info: </h3>
			<table class="table" border="1">
				<thead>
					<tr>
						<th>Deck ID</th>
						<th>Cards Remaining</th>
					</tr>
				</thead>
			<tbody>
				<tr>
					<td>${newC.deck_id}</td>
					<td>${draw.remaining}</td>
				<tr>
			</tbody>
			</table>
			<br/>
				<c:forEach items="${drawCards}" var="d">
						<img src="${d.image}">
				</c:forEach>
	</div>
	</form>
</body>
</html>	