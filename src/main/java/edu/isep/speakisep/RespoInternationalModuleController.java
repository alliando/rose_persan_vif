package edu.isep.speakisep;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.ModuleRepository;
import net.ubilife.spring.customerjdbc.UserRepository;

@Controller
public class RespoInternationalModuleController {
	private static final String SQL_INNER ="SELECT * FROM user INNER JOIN module WHERE module.STATUT='en attente' AND user.`userId`=module.`userId`";

	@RequestMapping("/respo_international_module")

	public String showInternational(HttpServletRequest request) {
		//Récupération des repository
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ModuleRepository repoM = ctx.getBean(ModuleRepository.class);
		UserRepository repoU = ctx.getBean(UserRepository.class);

		//Données envoyées à la view
		request.setAttribute("moduleFound", repoM.findAllBySql(SQL_INNER));
		request.setAttribute("eleveFound", repoU.findAllBySql(SQL_INNER));

		System.out.println("a  :"+repoU.findAllBySql(SQL_INNER));
		return "respo_international_module";
	}

}