package edu.isep.speakisep;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.Parcours;
import net.ubilife.spring.customerjdbc.ParcoursRepository;
import net.ubilife.spring.customerjdbc.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RespoProfilModifyController {
	@RequestMapping("/respo_profil_modify")

	public String Profil_respo(
			HttpServletRequest request
	){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ParcoursRepository repo=ctx.getBean(ParcoursRepository.class);
		request.setAttribute("parcours", repo.findAll());
		System.out.println("a  :"+repo.findAll());

		for (Parcours t : repo.findAll()){
			System.out.println(t.getId()+","+t.getNomparcours()+",");
		}

		return "respo_profil_modify";
	}
}
