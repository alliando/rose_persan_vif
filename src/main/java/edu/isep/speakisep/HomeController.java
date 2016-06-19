package edu.isep.speakisep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	Relative_ROOT c=new Relative_ROOT();
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
System.out.println("negr :"+ c.imagePath);

		return "home";
	}

}
