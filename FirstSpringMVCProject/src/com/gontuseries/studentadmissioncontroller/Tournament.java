package com.gontuseries.studentadmissioncontroller;

import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
@Entity
public class Tournament {

	@Id
	@GeneratedValue
	public int orderNumber; 
	private String TournamentName;
	private String GameName; 
	private String TournamentTime;
	private String TournamentInfo;
	
    @Embedded
	public GameInfo ThisGameInfo; //flyweight object
    
    public GameInfo getThisGameInfo() {
        return ThisGameInfo;
    }

    public void setThisGameInfo(GameInfo info) {
        this.ThisGameInfo = info; 
    }
    
    
	public String getTournamentName() {
		return TournamentName;
	}
	public void setTournamentName(String tournamentName) {
		TournamentName = tournamentName;
	}
	public String getGameName() {
		return GameName;
	}
	public void setGameName(String gameName) {
		GameName = gameName;
	}
	public String getTournamentTime() {
		return TournamentTime;
	}
	public void setTournamentTime(String tournamentTime) {
		TournamentTime = tournamentTime;
	}
	public String getTournamentInfo() {
		return TournamentInfo;
	}
	public void setTournamentInfo(String tournamentInfo) {
		TournamentInfo = tournamentInfo;
	}





}
