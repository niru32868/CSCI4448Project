<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1>Team Form</h1>
	<h3>Create Your Legendary Super Saiyan Team Here for Tournament # ${id}</h3>

	<form:errors path="team1.*"/>
	
	<form action="/FirstSpringMVCProject/submittedTeam.html" method="post">
		<table>
		<tr><td>Team Name:   		</td>  <td>       <input type="text" name="teamName" />   </td> </tr>
		<tr><td>In Game Name: 		</td>  <td>       <input type="text" name="teamMember" /> </td> </tr>
						<tr><td>Tournament Name :	</td>  <td>    			<select name="tournamentName" single>
																<option value=${tournamentname}>${tournamentname} </option>
														
																</select><td></tr>
				<tr><td>Tournament ID :	</td>  <td>    			<select name="orderNumber" single>
																<option value=${id} >${id}</option>
															
																</select><td></tr>																
		
	
		

		
		<tr><td><input type="submit" value="Submit this form by clicking here" /></td></tr>
	</table>
		
	</form>
 
</body>
</html>

