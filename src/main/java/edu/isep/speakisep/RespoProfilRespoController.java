package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RespoProfilRespoController {
	@Autowired
	@RequestMapping("/respo_profilRespo")
	
	public String Profil_respo(){
		return "respo_profilRespo";
	}
}
