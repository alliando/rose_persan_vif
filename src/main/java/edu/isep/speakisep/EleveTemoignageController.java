package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EleveTemoignageController {
	@Autowired
	@RequestMapping("/eleve_temoignage")
	
	public String Profil_respo(){
		return "eleve_temoignage";
	}
}
