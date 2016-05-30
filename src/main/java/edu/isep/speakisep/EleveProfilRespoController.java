package edu.isep.speakisep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EleveProfilRespoController {

	@RequestMapping("/eleve_profilRespo")
	public String Profil_respo(){
		return "eleve_profilRespo";
	}

}
