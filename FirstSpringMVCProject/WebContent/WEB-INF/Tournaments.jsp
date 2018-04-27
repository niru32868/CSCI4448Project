<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1>Tournaments Info</h1>
	<h3>Create Tournament Here, MAX 8 participants</h3>

	<form:errors path="tournament1.*"/>
	
	<form action="/FirstSpringMVCProject/submittedTournament.html" method="post">
		<table>
		<tr><td>Tournament Name:   		</td>  <td>       <input type="text" name="TournamentName" />   </td> </tr>
				<tr><td>Game Name :	</td>  <td>    			<select name="GameName" single>
																<option value="StreetFighter">StreetFighter</option>
																<option value="DragonBallZ">DragonBallZ</option>
																<option value="Starcraft2">Starcraft2</option>
																</select><td></tr>
		<tr><td>Tournament Time: 		</td>  <td>       <input type="text" name="TournamentTime" /> </td> </tr>
		<tr><td>Tournament Info:    		</td>  <td>       <input type="text" name="TournamentInfo" />    </td> </tr>
		
		<tr><td><input type="submit" value="Submit this form by clicking here" /></td></tr>
	</table>
		
	</form>
 
</body>
</html>

