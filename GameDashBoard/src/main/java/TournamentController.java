package application;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class TournamentController {
	@Autowired
	private TournamentChecking tournamentChecking;
	
	@RequestMapping(method=RequestMethod.POST,value= "/registednewTournament")
	public void RegistorNewTournament(Form form){

	}

	@RequestMapping(method=RequestMethod.POST,value= "/DeleteTournament")
	public void DeleteTournament(String name){
		
	}

	@RequestMapping(method=RequestMethod.POST,value= "/addContestants")
	public void addContestants(Conts arraylist){
		
	}

	@RequestMapping(method=RequestMethod.POST,value= "/JudgeIfUserCanJoin")
	public Boolean JudgeIfUserCanJoin(User user){
		
	}

	@RequestMapping(method=RequestMethod.POST,value= "/ViewAllTournaments")
	public Arraylist<Tournament> DeleteTournament(String name){
		return tournamentChecking.ViewAllTournaments();	
	}
}