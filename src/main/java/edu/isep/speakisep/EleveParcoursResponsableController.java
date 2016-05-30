package edu.isep.speakisep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EleveParcoursResponsableController {
	@RequestMapping("/eleve_parcours_responsable")
	
	public String eleve_parcours_responsable(){

		return "eleve_parcours_responsable";
	}
}
