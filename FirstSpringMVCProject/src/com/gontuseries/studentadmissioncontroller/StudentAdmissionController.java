package com.gontuseries.studentadmissioncontroller;
import java.util.ArrayList;

import org.hibernate.Query;
//ORIGINAL IS FROM GONTU series, but I basically edited out everything
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.persistence.Entity;
//original gotten from gontu series. But everything was changed other than the ClassNames like this one. 
@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/tournament.html", method = RequestMethod.GET)
	public ModelAndView getTournaments() {

		ModelAndView model2 = new ModelAndView("Tournaments");
		
		return model2;
	}
	@RequestMapping(value="/submittedTournament.html", method=RequestMethod.POST)
	public ModelAndView submitTournamentForm(@RequestParam("GameName") String Game,@ModelAttribute("tournament1") Tournament tournament1, BindingResult result) {
		
		 if (result.hasErrors()) {

				ModelAndView model2 = new ModelAndView("Tournaments");
				return model2;
		 }
	  GameInfo info; 
	  if(Game.equals("StreetFighter")){ // I have no idea why GameInfoFactory.getGameInfo(Game) doesn't work!
 		 info = GameInfoFactory.getGameInfo("StreetFighter");
	  }
	  else if (Game.equals("DragonBallZ")){
		info = GameInfoFactory.getGameInfo("DragonBallZ");
	}
	  else {
		  info = GameInfoFactory.getGameInfo("Starcraft2");
	  }
	  tournament1.setThisGameInfo(info); 
	  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  session.beginTransaction();

	  session.save(tournament1);
	  
	  session.getTransaction().commit();
	  session.close();
	

		ModelAndView model2 = new ModelAndView("TournamentSuccess");
		return model2;
	}
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView getHomePage() {

		ModelAndView model2 = new ModelAndView("Homepage");
		
		return model2;
	}
	
	
	@RequestMapping(value = "signup/{tournamentname}/{id}", method=RequestMethod.GET) //signup Page for teams
	public ModelAndView teamSignUp(@PathVariable("id")int id,@PathVariable("tournamentname") String tournamentname) {

		ModelAndView model3 = new ModelAndView("TeamSignup");
		
		return model3;
	}	
	@RequestMapping(value = "removeuser/{tournamentname}/{id}", method=RequestMethod.GET) //signup Page for teams
	public ModelAndView removeUser(@PathVariable("id")int id,@PathVariable("tournamentname") String tournamentname) {

		ModelAndView model3 = new ModelAndView("removeUser");
		
		return model3;
	}	
	@RequestMapping(value="/removeduser.html", method=RequestMethod.POST)
	public ModelAndView removeduser(@RequestParam("TeamName") String TeamName) {
		String queryz = "DELETE FROM team WHERE teamName = '" + TeamName + "'"; 
		

		ModelAndView model2 = new ModelAndView("removeduser");
		model2.addObject("queryz",queryz);
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  Query query = session.createSQLQuery(queryz);
		  query.executeUpdate();
		  session.getTransaction().commit();
		  session.close();
		return model2;
	}
	@RequestMapping(value = "reportscore.html", method=RequestMethod.GET) //signup Page for teams
	public ModelAndView reportScore() {

		ModelAndView model3 = new ModelAndView("reportScore");
		
		return model3;
	}	
	@RequestMapping(value="/reportedScore.html", method=RequestMethod.POST)
	public ModelAndView reportedScore(@RequestParam("WinnerTeam") String WinnerTeam,@RequestParam("LoserTeam") String LoserTeam) {
		String queryz = "DELETE FROM team WHERE teamName = '" + LoserTeam + "'"; 
		

		ModelAndView model2 = new ModelAndView("reportedScore");
		model2.addObject("queryz",queryz);
		model2.addObject("WinnerTeam",WinnerTeam);
		model2.addObject("LoserTeam",LoserTeam);
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  Query query = session.createSQLQuery(queryz);
		  query.executeUpdate();
		  session.getTransaction().commit();
		  session.close();
		return model2;
	}
	@RequestMapping(value = "deletetournament.html", method=RequestMethod.GET) //signup Page for teams
	public ModelAndView deleteTournament() {

		ModelAndView model3 = new ModelAndView("deleteTournament");
		
		return model3;
	}	
	@RequestMapping(value="/deletedTournament.html", method=RequestMethod.POST)
	public ModelAndView deletedTournament(@RequestParam("TournamentName") String Tournamentz) {
		String queryz = "DELETE FROM tournament WHERE TournamentName = '" + Tournamentz + "'"; 
		

		ModelAndView model2 = new ModelAndView("deletedTournament");
		model2.addObject("queryz",queryz);
		model2.addObject("Tournamentz",Tournamentz);
		  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  Query query = session.createSQLQuery(queryz);
		  query.executeUpdate();
		  session.getTransaction().commit();
		  session.close();
		return model2;
	}
	@RequestMapping(value = "/submittedTeam.html", method=RequestMethod.POST) //signup Page for teams
	public ModelAndView submitTeamForm(@ModelAttribute("team1") Team team, BindingResult result) {
		
		 if (result.hasErrors()) {

				ModelAndView model4 = new ModelAndView("TeamSignup");
				return model4;
		 }
	  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  session.beginTransaction();

	  session.save(team);
	  
	  session.getTransaction().commit();
	  session.close();


		ModelAndView model4 = new ModelAndView("TeamSignupSuccess");
		return model4;
	}
	@RequestMapping(value = "viewOpponent/{orderNumber}", method=RequestMethod.GET) //signup Page for teams
	public ModelAndView viewMatches(@PathVariable("orderNumber")int orderNumber) {
		int[] matches; 
		StrategyInterface FindMatches = new StrategyInterface();
		if ( (orderNumber & 1) == 0 ) //even, gotten from https://stackoverflow.com/questions/7342237/check-whether-number-is-even-or-odd
		{
			FindMatches.setStrategy(new matchNearest());
		}
		else	//odd
		{
			FindMatches.setStrategy(new matchOpposite());
		}
		matches = FindMatches.executeStrategy(); 
		String testing = "hello"; 
		ModelAndView model3 = new ModelAndView("Matches");
		model3.addObject("matches",matches);
		model3.addObject("testing",testing);
		return model3;
	}	
}


