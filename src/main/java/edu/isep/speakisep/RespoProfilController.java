package edu.isep.speakisep;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.FicheRepository;
import net.ubilife.spring.customerjdbc.ParcoursRepository;
import net.ubilife.spring.customerjdbc.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class RespoProfilController {
	@RequestMapping("/respo_profil")
	
	public String Profil_respo(	HttpServletRequest request
	){
		HttpSession session= request.getSession();
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ParcoursRepository repo=ctx.getBean(ParcoursRepository.class);
		FicheRepository repoF=ctx.getBean(FicheRepository.class);
		User user=(User)session.getAttribute("user");
		System.out.print ("YOYOYO : "+user.getIdParcours());
		if ((user.getIdParcours())!=0){
			session.setAttribute("parcours",repo.findOne(user.getIdParcours()));
		}
		session.setAttribute("Allparcours", repo.findAll());
		session.setAttribute("fiche",repoF.findOne(user));
		return "respo_profil";
	}
}