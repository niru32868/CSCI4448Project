<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<caption><h1> If you are matched vs no opponent, you auto qualify for next round </h1> </caption>
<h3>Team ${matches[0]} is Matched Against Team ${matches[1]}</h3>
<h3>Team ${matches[2]} is Matched Against Team ${matches[3]}</h3>
<h3>Team ${matches[4]} is Matched Against Team ${matches[5]}</h3>
<h3>Team ${matches[6]} is Matched Against Team ${matches[7]}</h3>
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/tournament"
        user="root" password="388693"
    />
     
    <sql:query var="teams"   dataSource="${myDS}">
        SELECT * FROM team WHERE orderNumber = ${orderNumber};
    </sql:query>
        <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Teams for this tournament</h2></caption>

            <tr>
                <th>Team Name</th>
                <th>Team Member</th>
                <th>Team Number</th>
                <th>Tournament Name</th>
            </tr>
            <c:forEach var="user" items="${teams.rows}">
                <tr>
                    <td><c:out value="${user.teamName}" /></td>
                    <td><c:out value="${user.teamMember}" /></td>
                    <td><c:out value="${user.teamNumber}" /></td>
                    <td><c:out value="${user.tournamentName}" /></td>

                </tr>
            </c:forEach>
        </table>
    </div>


</body>
</html>