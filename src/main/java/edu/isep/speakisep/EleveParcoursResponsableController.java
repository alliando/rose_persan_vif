package edu.isep.speakisep;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.Parcours;
import net.ubilife.spring.customerjdbc.ParcoursRepository;
import net.ubilife.spring.customerjdbc.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller

public class EleveParcoursResponsableController {
	private static final String SQL_INNER = "SELECT * from parcours INNER JOIN user WHERE parcours.IDPARCOURS=user.IDPARCOURS AND user.type='respo'";

	@RequestMapping("/eleve_parcours_responsable")
	public String eleve_parcours_responsable(HttpServletRequest request){
		//Récupération des repository
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ParcoursRepository repoParcours = ctx.getBean(ParcoursRepository.class);
		UserRepository repoUser = ctx.getBean(UserRepository.class);

		//Données envoyées à la view
		request.setAttribute("parcoursFound", repoParcours.findAllBySql(SQL_INNER));
		request.setAttribute("respoFound", repoUser.findAllBySql(SQL_INNER));

		return "eleve_parcours_responsable";
	}
}
