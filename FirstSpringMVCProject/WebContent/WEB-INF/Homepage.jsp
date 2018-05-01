<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Tournaments</title>
</head>
<body>
     <%--HELP FROM https://www.gontu.org http://javawebtutor.com/articles/spring/spring-mvc-hibernate-crud-example.php 
     http://www.codejava.net/java-ee/jsp/how-to-list-records-in-a-database-table-using-jsp-and-jstl
     FOR ALL JSP Pages
     XML files help from gontu.org--%> 
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/tournament"
        user="root" password="388693"
    />
     
    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM tournament;
    </sql:query>
     
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Tournaments</h2></caption>

            <tr>
                <th>Tournament Name</th>
                <th>Game Name</th>
                <th>Tournament Time</th>
                <th>Tournament Info</th>
                <th>Game Type</th>
                <th>Game Description</th>
                 <th>Registration</th>
                 <th>Unregistration</th>
            </tr>
            <c:forEach var="user" items="${listUsers.rows}">
                <tr>
                    <td><c:out value="${user.TournamentName}" /></td>
                    <td><c:out value="${user.GameName}" /></td>
                    <td><c:out value="${user.TournamentTime}" /></td>
                    <td><c:out value="${user.TournamentInfo}" /></td>
                    <td><c:out value="${user.GameType}" /></td>
                    <td><c:out value="${user.GameDescription}" /></td>
                    <td><a href="/FirstSpringMVCProject/signup/${user.TournamentName}/${user.orderNumber}">Sign Up</a></td>
                    <td><a href="/FirstSpringMVCProject/removeuser/${user.TournamentName}/${user.orderNumber}">Unregister</a></td>
  
                </tr>
            </c:forEach>
        </table>
        <caption><h3><a href="/FirstSpringMVCProject/tournament.html">Create Tournament</a></h3></caption>
         <caption><h3><a href="/FirstSpringMVCProject/deletetournament.html">Delete Tournament</a></h3></caption>
         <caption><h3><a href="/FirstSpringMVCProject/reportscore.html">Report Score</a></h3></caption>
                   <h4>Each Tournament has 8 MAX participants</h4>
    </div>
</body>
</html>
