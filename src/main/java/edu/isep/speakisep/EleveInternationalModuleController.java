package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EleveInternationalModuleController {
	@Autowired
	@RequestMapping("/eleve_international_module")
	
	public String module_eleve(){
		return "eleve_international_module";
	}
}
