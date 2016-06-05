package edu.isep.speakisep;
import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.User;
import net.ubilife.spring.customerjdbc.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class RespoEleveController {
	@RequestMapping("/respo_eleve")
	public String Respo_eleves(
			HttpServletRequest request
			){
		HttpSession session= request.getSession();
		User user =(User)session.getAttribute("user");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		UserRepository repoUser=ctx.getBean(UserRepository.class);
		request.setAttribute("eleves", repoUser.findAll());
		request.setAttribute("elevedeMonParcours", repoUser.findAll(user.getIdParcours()));
		return "respo_eleve";
	}
}
