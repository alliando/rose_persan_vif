package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModifyProfilRespoController {
	@Autowired
	@RequestMapping("/modify_profilRespo")
	
	public String Profil_respo(){
		return "modify_profilRespo";
	}
}
