package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RespoInternationalModuleController {
	@Autowired
	@RequestMapping("/respo_international_module")

	public String showInternational() {
		return "respo_international_module";
	}

}