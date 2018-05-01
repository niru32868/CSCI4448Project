<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h3>Delete User from Tournament Here</h3>

	<form:errors path="tournament1.*"/>
	
	<form action="/FirstSpringMVCProject/removeduser.html" method="post">
		<table>
		<tr><td>Team Name:   		</td>  <td>       <input type="text" name="TeamName" />   </td> </tr>

		
		<tr><td><input type="submit" value="Delete Team From Tournament by clicking here" /></td></tr>
	</table>
		
	</form>
 
</body>
</html>

