import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Team{
    private String TeamName;
    private ArrayList<User> TeamMenber;
    private ArrayList<Match> Schedule;

    public String getTeanName(){
        return TeamName;
    }

    public ArrayList<User> getTeanMenber(){
        return TeamMenber;
    } 

    public ArrayList<Match> getSchedule(){
        return Match;
    }

    public void setTeamName(String name){
        this.TeamName=name;
    }

    public void setTeanMenber(ArrayList<User> teamMember){
        this.TeamMenber=teamMember;
    }

    public void setSchedule(ArrayList<Match> teamSchedule){
        this.Schedule=teamSchedule;
    }
}