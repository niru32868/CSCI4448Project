package application;
import java.util.*;

public class From {
	private String tournamentname;
	private Time time;
	private String sponsors;
	private Int bounds;

	public String getTournamentname(){
		return this.tournamentname;
	}

	public void setTournamentname(String name){
		this.tournamentname=name;
	}

	public Time getTime(){
		return this.time;
	}

	public void setTime(Time time){
		this.time=time;
	}

	public String getSponsors(){
		return this.sponsors;
	}

	public void setSponsors(String sponsors){
		this.sponsors=sponsors
	}

	public Int getBounds(){
		return this.bounds;
	}

	public void setBounds(int bounds){
		this.bounds=bounds;
	}
}