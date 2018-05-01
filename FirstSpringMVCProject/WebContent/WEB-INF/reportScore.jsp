<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h3>Submit Results here</h3>

	<form:errors path="tournament1.*"/>
	
	<form action="/FirstSpringMVCProject/reportedScore.html" method="post">
		<table>
		<tr><td>Winner(Winning Team Name):   		</td>  <td>       <input type="text" name="WinnerTeam" />   </td> </tr>
		<tr><td>Loser(Loser Team Name):   		</td>  <td>       <input type="text" name="LoserTeam" />   </td> </tr>

		
		<tr><td><input type="submit" value="Submit Score here" /></td></tr>
	</table>
		
	</form>
 
</body>
</html>

