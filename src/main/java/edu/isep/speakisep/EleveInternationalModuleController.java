package edu.isep.speakisep;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.Module;
import net.ubilife.spring.customerjdbc.ModuleRepository;
import net.ubilife.spring.customerjdbc.UniversiteRepository;
import net.ubilife.spring.customerjdbc.User;

@Controller

public class EleveInternationalModuleController {
	@RequestMapping(value = "/eleve_ajoutmodules", method = RequestMethod.POST)
	public String form(HttpServletRequest request,
			@RequestParam("universite") String universite,
			@RequestParam("description") String description,
			@RequestParam("lien") String lien)
	{
		HttpSession session= request.getSession();
		User user =(User)session.getAttribute("user");
		
		//Récupération des données
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ModuleRepository repoM = ctx.getBean(ModuleRepository.class);
		
		//Conversion en UTF-8
		try {
			universite = new String(universite.getBytes("iso-8859-1"), "utf8");
			description = new String(description.getBytes("iso-8859-1"), "utf8");
			lien = new String(lien.getBytes("iso-8859-1"), "utf8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		if(!universite.equals("") && !description.equals("") && !lien.equals("")){
			Module module = new Module(universite,description,lien,"en attente",null,user.getId());
			repoM.save(module);
		}
		else{
			
		}

		return "redirect:eleve_international";
	}

	@RequestMapping("/eleve_international_module")

	public String module_eleve(HttpServletRequest request){

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		UniversiteRepository repoUniv = ctx.getBean(UniversiteRepository.class);

		//Données envoyées à la view
		request.setAttribute("universite", repoUniv.findAll());
		return "eleve_international_module";
	}
}
