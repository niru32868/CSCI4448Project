package com.gontuseries.studentadmissioncontroller;

import javax.persistence.Embeddable;

@Embeddable
public class GameInfo {

	private String GamePublisher;
	private String GameType;
	private String GameDescription;
	
    public GameInfo() {
    }
    
    public GameInfo(String GameName) {
    	if (GameName.equals("StreetFighter")) {
    		this.GamePublisher = "Capcom";
    		this.GameType = "Fighting";
    		this.GameDescription = "Fighters from all around the world";
    	}
    	else if (GameName.equals("DragonBallZ")) {
    		this.GamePublisher = "Arc System Works";
    		this.GameType = "Fighting";
    		this.GameDescription = "Screams for 3 hours";
    		
    	}
    	else if (GameName.equals("Starcraft2")) {
    		this.GamePublisher = "Blizzard"; 
    		this.GameType = "Strategy";
    		this.GameDescription = "Your wish is my command";   		
    	}
    }
    public GameInfo(String GamePublisher, String GameFormat, String GameDescription) {
    	this.GamePublisher = GamePublisher;
    	this.GameType = GameFormat;
    	this.GameDescription = GameDescription; 
    }
	public String getGameType() {
		return GameType;
	}
	public void setGameType(String gameType) {
		this.GameType = gameType;
	}
	public String getGameDescription() {
		return GameDescription;
	}
	public void setGameDescription(String gameDescription) {
		GameDescription = gameDescription;
	}
	public String getGamePublisher() {
		return GamePublisher;
	}
	public void setGamePublisher(String gamePublisher) {
		GamePublisher = gamePublisher;
	} 
}
