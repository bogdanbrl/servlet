<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- ERROR  page. This page is inserted in home.jsp using errorPage keyword. This page will handle errors. -->
	<%= exception.getMessage() %>
	
</body>
</html>