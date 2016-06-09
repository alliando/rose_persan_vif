package edu.isep.speakisep;

import net.ubilife.spring.customerjdbc.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
public class RespoProfilModifyController {
	@RequestMapping(value = "/form_modifierProfil", method = RequestMethod.POST)
	public String form(	HttpServletRequest request,
			@RequestParam("nomParcours") String nomParcours,
			@RequestParam("numSalle") String numSalle)

	{
		HttpSession session= request.getSession();
		//Récupération des données user/fiche
		User user =(User)session.getAttribute("user");
		Fiche fiche =(Fiche)session.getAttribute("fiche");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ParcoursRepository repoP = ctx.getBean(ParcoursRepository.class);
		UserRepository repoU = ctx.getBean(UserRepository.class);
		FicheRepository repoF = ctx.getBean(FicheRepository.class);
		//Conversion en UTF-8
		try {
			nomParcours = new String(nomParcours.getBytes("iso-8859-1"), "utf8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		if (!nomParcours.equals("")){
			long parcoursId = repoP.findOne(nomParcours).getId();
			user.setIdParcours(parcoursId);
			repoU.updateOne(user);
		}
		if(!numSalle.equals("")){
			fiche.setNumsalle(numSalle);
			repoF.updateOne(fiche);}



		return "redirect:respo_profil";
	}


	@RequestMapping("/respo_profil_modify")

	public String Profil_respo(){
		return "respo_profil_modify";
	}
}
