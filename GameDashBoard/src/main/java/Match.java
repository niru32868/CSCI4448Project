package java_study;

public class Match {
    private Time Date = new Time();
    private Team Team1 = new Team();
    private Team Team2 = new Team();
    private Team Winner = new Team();
    public Time getDate(){
        return Date;
    }
    public Team getTeam1(){
        return Team1;
    }
    public Team getTeam2(){
        return Team2;
    }
    public Team getWinner(){
        return Winner;
    }
    public void getTeam1(Time time){
        this.Date = time;
    }
    public void getTeam1(Team team){
        this.Team1= team;
    }
    public void getTeam2(Team team){
        this.Team2= team;
    }
    public void getWinner(Team team){
        this.Winner= team;
    }
    public void ShowResult(){
        System.out.println('Winner is '+ Winner);
    }
    public void upDateMatch(Match match){
        this.Date = match.Date;
        this.Team1 = match.Team1;
        this.Team2 = match.Team2;
        this.Winner = match.Winner;
    }
}
