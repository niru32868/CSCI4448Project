
public class User {
	private String UserName;
	private String UserPassword;
	private post[] PostList;
	private tournament[] JoinedTournament;
	
	public String getUserName(){
		return UserName; 
	}
	
	public String getUserPassword() {
		return UserPassword;
	}
	
	public void setUserName(String name) {
		UserName = name; 
	}
	
	public void setUserPassword(String name) {
		UserPassword = name; 
	}
	
	public post[] getUserPosts() {
		return PostList[];
	}
	
	public tournament[] getJoinedTournament() {
		return JoinedTournament; 
	}
}
