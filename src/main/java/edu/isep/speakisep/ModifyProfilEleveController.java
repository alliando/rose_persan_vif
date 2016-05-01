package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModifyProfilEleveController {
	@Autowired
	@RequestMapping("/modify_profilEleve")
	
	public String Profil_respo(){
		return "modify_profilEleve";
	}
}
