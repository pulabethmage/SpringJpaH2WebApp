<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Alien Data</title>
</head>
<body>
<c:forEach var="ali" items="${listAliens}" varStatus="status">
			<tr>
			
				<td>${ali.aid}</td>
				<td>${ali.aname}</td>
				
			</tr>
		</c:forEach>
</body>
</html>