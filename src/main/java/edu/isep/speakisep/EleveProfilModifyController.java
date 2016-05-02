package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EleveProfilModifyController {
	@Autowired
	@RequestMapping("/eleve_profil_modify")
	
	public String Profil_respo(){
		return "eleve_profil_modify";
	}
}
