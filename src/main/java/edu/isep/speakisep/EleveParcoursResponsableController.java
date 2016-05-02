package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EleveParcoursResponsableController {
	@Autowired
	@RequestMapping("/eleve_parcours_responsable")
	
	public String eleve_temoignage(){
		return "eleve_parcours_responsable";
	}
}
