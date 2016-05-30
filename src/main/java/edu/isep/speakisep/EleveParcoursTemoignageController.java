package edu.isep.speakisep;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.Parcours;
import net.ubilife.spring.customerjdbc.ParcoursRepository;
import net.ubilife.spring.customerjdbc.Temoignage;
import net.ubilife.spring.customerjdbc.TemoignageRepository;
import net.ubilife.spring.customerjdbc.UserRepository;

@Controller

public class EleveParcoursTemoignageController {
	@RequestMapping("/eleve_parcours_temoignage")
	
	public String eleve_temoignage(HttpServletRequest request){
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		TemoignageRepository repo=ctx.getBean(TemoignageRepository.class);
		UserRepository repo3=ctx.getBean(UserRepository.class);
		request.setAttribute("temoignage", repo.findAll());
		System.out.println("a  :"+repo.findAll());
		for (Temoignage t : repo.findAll()){
			System.out.println(t.getNomtem()+","+t.getDescriptem()+",");
			request.setAttribute("user",repo3.findOne(t.getUserId()));
		}
		
		ParcoursRepository repo1=ctx.getBean(ParcoursRepository.class);
		request.setAttribute("parcours", repo1.findAll());
		System.out.println("a  :"+repo1.findAll());
		for (Parcours t : repo1.findAll()){
			System.out.println(t.getNomparcours()+","+t.getDescription()+",");
		}
		
		
		return "eleve_parcours_temoignage";
	}
}
