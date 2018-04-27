package com.gontuseries.studentadmissioncontroller;

import java.util.ArrayList;
import java.util.Date;


public class TournamentList {


	private static ArrayList<Tournament> Tournaments;

	public static ArrayList<Tournament> getTournaments() {
		return Tournaments;
	}

	public static void setTournaments(ArrayList<Tournament> tournaments) {
		Tournaments = tournaments;
	}
	


	
}