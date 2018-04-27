package com.gontuseries.studentadmissioncontroller;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model1 = new ModelAndView("AdmissionForm");
		
		return model1;
	}

	@ModelAttribute
    public void addingCommonObjects(Model model1) {
		
		model1.addAttribute("headerMessage", "Gontu College of Engineering, India");
	}

	
	@RequestMapping(value="/submittedForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student, BindingResult result) {
		
		 if (result.hasErrors()) {

				ModelAndView model1 = new ModelAndView("AdmissionForm");
				return model1;
		 }

		ModelAndView model1 = new ModelAndView("AdmissionSuccess");
		return model1;
	}
	
	@RequestMapping(value="/tournament.html", method = RequestMethod.GET)
	public ModelAndView getTournaments() {

		ModelAndView model2 = new ModelAndView("Tournaments");
		
		return model2;
	}
	@RequestMapping(value="/submittedTournament.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("GameName") String Game,@ModelAttribute("tournament1") Tournament tournament1, BindingResult result) {
		
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
	  sessionFactory.close();

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
}

