package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class RespoUniversiteController {
	@Autowired
	@RequestMapping("/respo_universite")
	
	public String Profil_respo(){
		return "respo_universite";
	}
}
