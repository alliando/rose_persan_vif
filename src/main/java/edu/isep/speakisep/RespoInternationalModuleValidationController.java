package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RespoInternationalModuleValidationController {
	@Autowired
	@RequestMapping("/respo_validation_module")

	public String Validate_module_respo(){
		return "respo_validation_module";
	}
}
