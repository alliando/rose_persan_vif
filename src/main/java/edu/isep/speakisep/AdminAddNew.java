package edu.isep.speakisep;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.Parcours;
import net.ubilife.spring.customerjdbc.ParcoursRepository;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminAddNew {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminAddNew.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/admin_AddNew", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ParcoursRepository repo1=ctx.getBean(ParcoursRepository.class);
		request.setAttribute("parcours", repo1.findAll());
		System.out.println("a  :"+repo1.findAll());
		for (Parcours t : repo1.findAll()){
			System.out.println(t.getNomparcours()+","+t.getDescription()+",");
		}
		return "admin_AddNew";
	}
	
}
