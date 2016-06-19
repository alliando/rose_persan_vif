package edu.isep.speakisep;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.security.core.context.SecurityContextHolder;
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

import edu.isep.JDBC.Config;
import edu.isep.JDBC.Fiche;
import edu.isep.JDBC.FicheRepository;
import edu.isep.JDBC.User;
import edu.isep.JDBC.UserManager;
import edu.isep.JDBC.UserRepository;
import edu.isep.JDBC.UserRepositoryImpl;
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
	public String submitForm(Model model, 
			@RequestParam("userId") String userId, 
			@RequestParam("password") String password, 
			@Validated User form, 
			BindingResult result, 
			HttpServletRequest request) {
		
		model.addAttribute("form", form);

		LDAPObject ldap = ISEPAuth( userId , password );
		String returnVal = "home";
		HttpSession session= request.getSession();
		User user = new User(ldap.login, ldap.password, ldap.nom, ldap.nomFamille, ldap.prenom, ldap.getType(), ldap.getNumber(), ldap.mail);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		UserRepository repo = ctx.getBean(UserRepository.class);
		FicheRepository repoF=ctx.getBean(FicheRepository.class);

		if(ldap == null) {
			returnVal = "form";
		}
		else{
			model.addAttribute("form", form);

			String type = ldap.getType(); 

			request.getSession().setAttribute("loggedInUser", session);
			request.getSession().setAttribute("username", user.getPrenom());

			//regarde si l'utilisateur est déjà inscrit dans la DB speakIsep
			int register=0;
			for (User t : repo.findAll()){
				if(t.getLogin().equals(user.getLogin())){
					user=t;
					register=1;
					if (type.equals("eleve")){
						returnVal= "eleve";
						request.getSession().setAttribute("eleveLoggedIn", type);
						request.getSession().setAttribute("user", user);
					} else if ( type.equals("admin") ){
						returnVal= "admin";
						request.getSession().setAttribute("adminLoggedIn", type);
						request.getSession().setAttribute("user", user);
					} else if ( type.equals("respo") ){
						returnVal= "respo";
						request.getSession().setAttribute("respoLoggedIn", type);
						request.getSession().setAttribute("user", user);
					}
					break;
				}
			}
			request.getSession().setAttribute("user", user);

			System.out.println(register);
			
			//Si l'utilisateur n'est pas inscrit, on l'enregistre lui+sa fiche
			if (register!=1){
			repo.save(user);
			Fiche fiche=new Fiche("",null,"","","","", "","", "", "", "", "","",user.getId());
			repoF.save(fiche);
			if (type.equals("eleve")){
				returnVal= "eleve_profil_modify";
				request.getSession().setAttribute("eleveLoggedIn", type);
				request.getSession().setAttribute("user", user);
			} else if ( type.equals("admin") ){
				returnVal= "admin";
				request.getSession().setAttribute("adminLoggedIn", type);
				request.getSession().setAttribute("user", user);
			} else if ( type.equals("respo") ){
				returnVal= "respo_profil_modify";
				request.getSession().setAttribute("respoLoggedIn", type);
				request.getSession().setAttribute("user", user);
			}

			}
			session.setAttribute("fiche",repoF.findOne(user));

			repo.findOne(user.getId());
			session= request.getSession();
			session.getAttribute("numero");
		}

		return "redirect:"+returnVal;

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("loggedInUser");
		return "home";
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
