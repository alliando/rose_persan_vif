package edu.isep.speakisep;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ubilife.spring.customerjdbc.Admin;
import net.ubilife.spring.customerjdbc.AdminRepository;
import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.Etudiant;
import net.ubilife.spring.customerjdbc.EtudiantRepository;
import net.ubilife.spring.customerjdbc.Parcours;
import net.ubilife.spring.customerjdbc.ParcoursRepository;
import net.ubilife.spring.customerjdbc.Respo;
import net.ubilife.spring.customerjdbc.RespoRepository;
import net.ubilife.spring.customerjdbc.Temoignage;
import net.ubilife.spring.customerjdbc.TemoignageRepository;
import net.ubilife.spring.customerjdbc.Universite;
import net.ubilife.spring.customerjdbc.UniversiteRepository;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		//Pour ajouter des trucs dans la base de données il faut décommenter + pour tester si on est bien connecté à la BDD
		
		/*AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		EtudiantRepository repo = ctx.getBean(EtudiantRepository.class);
		RespoRepository repo1 = ctx.getBean(RespoRepository.class);
		ParcoursRepository repo2 = ctx.getBean(ParcoursRepository.class);
		TemoignageRepository repo3 = ctx.getBean(TemoignageRepository.class);
		UniversiteRepository repo4 = ctx.getBean(UniversiteRepository.class);
		AdminRepository repo5 = ctx.getBean(AdminRepository.class);

		Etudiant e1 = new Etudiant(1,"joe","Jane","c",1,"d","e",111);
		Etudiant e2 = new Etudiant(2,"ffff","moi","h",2,"i","j",222);
		
		Respo r1= new Respo("kazi-aoul","zakia","zkazi@isep.fr",1);
		Parcours p1= new Parcours("Génie logiciel","Le parcours pour être développeur",1,1);
		Temoignage t1= new Temoignage("Bon parcours","Super le parcours SI",8090);
		Universite u1= new Universite("Stanford University","la meilleur université à l'étanger","http://www.stanford.ca");
		Admin a1= new Admin("zkazi@isep.fr");
		
		e1=repo.save(e1);
		e2=repo.save(e2);
		
		r1=repo1.save(r1);
		
		p1=repo2.save(p1);
		
		t1=repo3.save(t1);
		
		u1=repo4.save(u1);
		
		a1=repo5.save(a1);
		
		for (Etudiant t : repo.findAll()){
			System.out.println(t.getId()+","+t.getNom()+","+t.getIdparcours());
		}
		
		for (Respo t : repo1.findAll()){
			System.out.println(t.getId()+","+t.getNom()+","+t.getIdparcours());
		}
		
		for (Parcours t : repo2.findAll()){
			System.out.println(t.getId()+","+t.getNomparcours()+","+t.getIdrespo());
		}
		
		for (Temoignage t : repo3.findAll()){
			System.out.println(t.getId()+","+t.getNomtem()+","+t.getIdeleve());
		}
		
		for (Universite t : repo4.findAll()){
			System.out.println(t.getId()+","+t.getNomuniv()+","+t.getLienuniv());
		}
		
		for (Admin t : repo5.findAll()){
			System.out.println(t.getId()+","+t.getMail());
		}
		
		 
		// update
		/*e2.setPrenom("Janet");		
		repo.update(e2);
		
		for(Etudiant t : repo.findAll()) {
			System.out.println(t.getNom()+", "+t.getPrenom());
		}
		 
		// delete
		repo.delete(e1);
		
		for(Etudiant t : repo.findAll()) {
			System.out.println(t.getNom()+", "+t.getPrenom());
		}
				
		ctx.close();*/
		
		return "home";
	}
	
}
