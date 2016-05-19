package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RespoModuleController {
	@Autowired
	@RequestMapping("/respo_module")

	public String Module_respo(){
		return "respo_module";
	}
}
