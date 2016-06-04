package edu.isep.speakisep;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.ParcoursRepository;
import net.ubilife.spring.customerjdbc.TemoignageRepository;
import net.ubilife.spring.customerjdbc.UserRepository;

@Controller

public class EleveParcoursTemoignageController {
	private static final String SQL_INNER = "SELECT * from temoignage NATURAL JOIN user WHERE temoignage.userId=user.userId";
	@RequestMapping("/eleve_parcours_temoignage")

	public String eleve_temoignage(HttpServletRequest request){

		//Récupération des repository
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ParcoursRepository repoParcours = ctx.getBean(ParcoursRepository.class);
		UserRepository repoUser = ctx.getBean(UserRepository.class);
		TemoignageRepository repoTem = ctx.getBean(TemoignageRepository.class);

		//Données envoyées à la view
		request.setAttribute("parcours", repoParcours.findAll());
		request.setAttribute("userFound", repoUser.findAllBySql(SQL_INNER));
		request.setAttribute("temoignage", repoTem.findAllBySql(SQL_INNER));

		//System.out.println("a  :"+repoTem.findAllBySql(SQL_INNER));


		return "eleve_parcours_temoignage";
	}
}
