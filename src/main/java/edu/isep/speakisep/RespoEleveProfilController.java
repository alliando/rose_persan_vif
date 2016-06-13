package edu.isep.speakisep;

import net.ubilife.spring.customerjdbc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller

public class RespoEleveProfilController {
	private static final String SQL_INNER = "SELECT * from parcours INNER JOIN user WHERE parcours.IDPARCOURS=user.IDPARCOURS AND user.type='respo'";

	@RequestMapping(value="/respo_eleve_profil" )
	public String Profil_respo(HttpServletRequest request,
			@RequestParam(value="id", required=false) long id){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		UserRepository repoUser= ctx.getBean(UserRepository.class);
		FicheRepository repoFiche= ctx.getBean(FicheRepository.class);

		User eleve=repoUser.findOne(id);
		Fiche eleveFiche=repoFiche.findOne(eleve);

		System.out.println("id  :" + id);
		//Vérifie que l'id existe
		User userFound=repoUser.findOne(id);
		request.setAttribute("eleve",eleve);
		request.setAttribute("eleveFiche",eleveFiche);

		if (repoUser.findOne(id)!=null){
			System.out.println("id  :" + eleve);

		}
		return "respo_eleve_profil";
	}
}
