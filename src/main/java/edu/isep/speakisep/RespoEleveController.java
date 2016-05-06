package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RespoEleveController {
	@Autowired
	@RequestMapping("/respo_eleve")
	
	public String Respo_eleves(){
		return "respo_eleve";
	}
}
