<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
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
		<td>${newC.remaining}</td>
		<tr>
	</tbody>
	</table>
	</div>

	<form action="send-id">
	<a href="/send-id?id=${newC.deck_id}"></a>
	</form>
	success?:${draw.success}
	
</body>
</html>	