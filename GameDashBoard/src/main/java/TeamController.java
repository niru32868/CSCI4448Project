package java_study;
import java.util.ArrayList;

public class TeamController {
    public ArrayList<Team> TeamList = new ArrayList<Team>();

    public void CrateTeam(Team team){
        TeamList.add(team);
    }
    public void DeleteTeam(Team team){
        TeamList.remove(team);
    }
    public ArrayList<Team> ViewAllTeams(){
        return TeamList;
    }
}
