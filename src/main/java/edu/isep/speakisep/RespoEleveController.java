package edu.isep.speakisep;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.User;
import net.ubilife.spring.customerjdbc.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RespoEleveController {
	@RequestMapping("/respo_eleve")
	public String Respo_eleves(
			HttpServletRequest request
	){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		UserRepository repo=ctx.getBean(UserRepository.class);
		request.setAttribute("eleves", repo.findAll());
		System.out.println(repo.findAll());
		return "respo_eleve";
	}

}
