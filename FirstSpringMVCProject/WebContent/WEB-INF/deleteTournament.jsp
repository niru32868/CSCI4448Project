<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1>Tournaments Info</h1>
	<h3>Delete Tournament Here</h3>

	<form:errors path="tournament1.*"/>
	
	<form action="/FirstSpringMVCProject/deletedTournament.html" method="post">
		<table>
		<tr><td>Tournament Name:   		</td>  <td>       <input type="text" name="TournamentName" />   </td> </tr>

		
		<tr><td><input type="submit" value="Delete Tournament by clicking here" /></td></tr>
	</table>
		
	</form>
 
</body>
</html>

