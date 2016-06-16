package edu.isep.speakisep;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.Parcours;
import net.ubilife.spring.customerjdbc.ParcoursRepository;
import net.ubilife.spring.customerjdbc.User;
import net.ubilife.spring.customerjdbc.UserRepository;


@Controller
public class AdminParcoursController {
	
	@RequestMapping(value = "/admin_parcours", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		//Récupération des repository
				AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
				ParcoursRepository repoParcours = ctx.getBean(ParcoursRepository.class);
				
				//Données envoyées à la view
				request.setAttribute("parcoursFound", repoParcours.findAll());
		return "admin_parcours";
	}
	
	@RequestMapping(value = "/admin_parcoursRemove")
	public String deleteParcours(
		@RequestParam(value = "id", required = false) long id){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ParcoursRepository repoParcours = ctx.getBean(ParcoursRepository.class);
		Parcours parcours = repoParcours.findOne(id);
		
		repoParcours.delete(parcours);
		return "redirect:admin_parcours";
		
	}
	
}
