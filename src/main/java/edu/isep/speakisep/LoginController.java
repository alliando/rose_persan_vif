package edu.isep.speakisep;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.User;
import net.ubilife.spring.customerjdbc.UserManager;
import net.ubilife.spring.customerjdbc.UserRepository;
import net.ubilife.spring.customerjdbc.UserRepositoryImpl;
import edu.isep.speakisep.LDAPObject;

@Controller
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Qualifier("formValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginForm(Model model){
		User form = new User();
		model.addAttribute("form", form);
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String submitForm(Model model, @RequestParam("userId") String userId, @RequestParam("password") String password, @Validated User form, BindingResult result, HttpServletRequest request) {
		model.addAttribute("form", form);
		System.out.println( "login : " + userId + " password : " + password );
		LDAPObject ldap = ISEPAuth( userId , password );
		 String returnVal = "eleve_home";
		 
		 
		 if(ldap == null) {
			 returnVal = "form";
		 }
		 else{
			 model.addAttribute("form", form);
			 //returnVal= "eleve_home";
			 String type = ldap.getType(); 
				
			HttpSession session = request.getSession();	
			if(session.isNew()){
				if (type.equals("eleve")){
					returnVal= "eleve_profil_modify";
				} else if ( type.equals("admin") ){
					returnVal= "admin_home";
				} else if ( type.equals("respo") ){
					returnVal= "respo_profil_modify";
				}
			}
			else {
				if (type.equals("eleve")){
					returnVal= "eleve_home";
				} else if ( type.equals("admin") ){
					returnVal= "admin_home";
				} else if ( type.equals("respo") ){
					returnVal= "respo_home";
				}
			}
				
				 User u1 = new User(ldap.login, ldap.password, ldap.nom, ldap.nomFamille, ldap.prenom, ldap.getType(), ldap.getNumber(), ldap.mail);
				 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
				 UserRepository repo = ctx.getBean(UserRepository.class);
				 repo.save(u1);	
		 }
		 return returnVal;
		 
	}
	
	/**
	 * This method is used to detect if the user is in isep's db
	 * 
	 * @param login
	 * @param password
	 * @return 
	 */
	private LDAPObject ISEPAuth( String login, String password ){
	
		LDAPaccess access = new LDAPaccess();
		try {
			LDAPObject isepUser = access.LDAPget( login , password ); 

		if (isepUser == null)
		{	
			System.err.println("user doesn't exist");
			return null;
		}
		    UserManager.sharedInstance().currentUser = this.warpUserModel(isepUser);
		
			return isepUser;
			
		} catch(Exception e) {
			
			if ( e instanceof AuthenticationException ){
				System.err.println(e.getMessage());
				return null;
			}
			
			System.err.println(e.getMessage());
			return null;
		}
	}
	
	private User warpUserModel (LDAPObject isepUser){
		return new User(isepUser.getLogin(), isepUser.getPassword(), isepUser.getNom(), isepUser.getNomFamille(), isepUser.getPrenom(), isepUser.getType(), isepUser.getNumber(), isepUser.getMail());
	}

}
