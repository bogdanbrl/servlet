<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- here is the taglib. insert jstl.jar into your library, otherwise it won't warking--> 
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Connection to a database and reading it</title>
</head>
<body>
	
	<sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost/db"
         user = "root"  password = ""/>
 
      afdssdf
      
      
      
      <sql:query dataSource = "${snapshot}" var = "result">
         SELECT * from gadgets;
      </sql:query>
 
      <table border = "1" width = "100%">
         <tr>
            <th>Nr crt</th>
            <th>Name</th>
            <th>Price</th>          
         </tr>
         
         
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.nrCrt}"/></td>
               <td><c:out value = "${row.name}"/></td>
               <td><c:out value = "${row.price}"/></td>
            </tr>
         </c:forEach>
      </table>
	
	
</body>
</html>