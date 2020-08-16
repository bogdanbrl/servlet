<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- here is the taglib -->
<!-- < %@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- < %
	String name = request.getAttribute("label").toString();
	out.print(name);
	%> -->
	
	<!-- below it is called         "expresion language"          using $, used by those who don't know java
	 language, but are web design developers. It does the same thing as the code up there -->
	
	${label} <br>
	
	<!-- if you want to use an external tag (eg. from java) 
	you must add a taglib. check upper in the file -->
	<!-- <c:out value = "Hello World" /> -->

	${std.name}<br>
	
	<!-- <!-- 
	<c:forEach items:"${stds} var="s">     this one didn't work for me because eclipse cannot find uri="http://java.sun.com/jsp/jstl/core"
		${s.name} <br>
	</c:forEach>	
	 -->
	

</body>
</html>