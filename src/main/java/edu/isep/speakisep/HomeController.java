package edu.isep.speakisep;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.Etudiant;
import net.ubilife.spring.customerjdbc.EtudiantRepository;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		EtudiantRepository repo = ctx.getBean(EtudiantRepository.class);

		Etudiant c1 = new Etudiant(1,"joe","Jane","c",1,"d","e",111);
		Etudiant c2 = new Etudiant(2,"ffff","moi","h",2,"i","j",222);
		
		c1=repo.save(c1);
		c2=repo.save(c2);
		
		for (Etudiant t : repo.findAll()){
			System.out.println(t.getId()+","+t.getNom()+","+t.getIdParcours());
		}
				 
		// update
		c2.setPrenom("Janet");		
		repo.update(c2);
		
		for(Etudiant t : repo.findAll()) {
			System.out.println(t.getNom()+", "+t.getPrenom());
		}
		 
		// delete
		repo.delete(c1);
		
		for(Etudiant t : repo.findAll()) {
			System.out.println(t.getNom()+", "+t.getPrenom());
		}
				
		ctx.close();
		
		return "home";
	}
	
}
