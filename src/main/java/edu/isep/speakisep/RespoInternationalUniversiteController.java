package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class RespoInternationalUniversiteController {
	@Autowired
	@RequestMapping("/respo_international_universite")
	
	public String Profil_respo(){
		return "respo_international_universite";
	}
}
