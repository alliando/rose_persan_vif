package edu.isep.speakisep;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.Universite;
import net.ubilife.spring.customerjdbc.UniversiteRepository;
import net.ubilife.spring.customerjdbc.User;
import net.ubilife.spring.customerjdbc.UserRepository;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminRespoAddController {
	
	@RequestMapping(value = "/admin_respo_add", method = RequestMethod.GET)
	public String home() {
		return "admin_respo_add";
	}
	
	@RequestMapping(value = "/admin_ajouterrespo", method = RequestMethod.POST)
	public String modifier(HttpServletRequest request,
			@RequestParam("nom") String nom,
			@RequestParam("parcours") long idParcours) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		UserRepository repoU= ctx.getBean(UserRepository.class);
		
		try {
			nom = new String(nom.getBytes("iso-8859-1"), "utf8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		if(!nom.equals("")){
			User respo = new User("","",nom,"","","","","",idParcours);
			repoU.save(respo);
			}

		
				return "redirect:admin_universities";
		
	}
	
}
