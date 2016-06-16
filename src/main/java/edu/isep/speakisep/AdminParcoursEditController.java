package edu.isep.speakisep;


import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.Parcours;
import net.ubilife.spring.customerjdbc.ParcoursRepository;


@Controller
public class AdminParcoursEditController {
	
	@RequestMapping(value = "/admin_parcours_edit", method = RequestMethod.GET)
	public String home(HttpServletRequest request,
			@RequestParam(value="id", required=false) long id) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ParcoursRepository repoP= ctx.getBean(ParcoursRepository.class);
		
		Parcours parcours=repoP.findOne(id);
		
		request.setAttribute("parcours",parcours);
		
		return "admin_parcours_edit";
	}
	
	@RequestMapping(value = "/admin_modifierparcours", method = RequestMethod.POST)
	public String modifier(HttpServletRequest request,
			@RequestParam("nom") String nom,
			@RequestParam("id") long id) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ParcoursRepository repoP= ctx.getBean(ParcoursRepository.class);
		
		Parcours parcours=repoP.findOne(id);
		
		try {
			nom = new String(nom.getBytes("iso-8859-1"), "utf8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		if(!nom.equals("")){
			parcours.setNomparcours(nom);
			repoP.updateOne(parcours);}
	
		
				return "redirect:admin_parcours";
	
}
}
