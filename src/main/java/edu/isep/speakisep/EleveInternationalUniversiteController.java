package edu.isep.speakisep;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.Universite;
import net.ubilife.spring.customerjdbc.UniversiteRepository;

@Controller

public class EleveInternationalUniversiteController {
	@RequestMapping("/eleve_international_universite")

	public String EleveInternationalUniversite(HttpServletRequest request){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		UniversiteRepository repo=ctx.getBean(UniversiteRepository.class);
		request.setAttribute("universites", repo.findAll());
		System.out.println("a  :"+repo.findAll());
		for (Universite t : repo.findAll()){
			System.out.println(t.getNomuniv()+","+t.getLienuniv()+",");
		}
		return "eleve_international_universite";
	}
}
