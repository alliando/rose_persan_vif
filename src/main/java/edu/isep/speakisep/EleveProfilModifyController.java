package edu.isep.speakisep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.User;
import net.ubilife.spring.customerjdbc.UserRepository;

@Controller
public class EleveProfilModifyController {
	@Autowired
	@RequestMapping("/eleve_profil_modify")
	
	public String Profil_respo(){
		/* User u1 = new User(ldap.login, ldap.password, ldap.nom, ldap.nomFamille, ldap.prenom, ldap.getType(), ldap.getNumber(), ldap.mail);
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		 UserRepository repo = ctx.getBean(UserRepository.class);
		 repo.save(u1);	*/
		return "eleve_profil_modify";
	}
}
