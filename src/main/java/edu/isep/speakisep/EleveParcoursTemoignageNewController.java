package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EleveParcoursTemoignageNewController {
	@Autowired
	@RequestMapping("/eleve_parcours_temoignage_new")
	
	public String eleve_temoignage_new(){
		return "eleve_parcours_temoignage_new";
	}
}
