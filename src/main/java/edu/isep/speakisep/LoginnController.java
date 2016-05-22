package edu.isep.speakisep;

import net.ubilife.spring.customerjdbc.Config;
import net.ubilife.spring.customerjdbc.User;
import net.ubilife.spring.customerjdbc.UserManager;
import net.ubilife.spring.customerjdbc.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
public class LoginnController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@RequestMapping(value = "/loginn", method = RequestMethod.GET)
	public String showLoginForm(Model model){
		User form = new User();
		model.addAttribute("form", form);
		return "home";
	}

	@RequestMapping(value = "/loginn", method = RequestMethod.POST)
	public String submitForm(Model model,
							 @RequestParam("login") String login,
							 @RequestParam("password") String password,
							 @RequestParam("nom") String nom,
							 @RequestParam("nomFamille") String nomFamille,
							 @RequestParam("prenom") String prenom,
							 @RequestParam("type") String type,
							 @RequestParam("number") String number,
							 @RequestParam("mail") String mail,

							 HttpServletRequest request) {
		HttpSession session= request.getSession();
		//System.out.println( "login : " + userId + " password : " + password );
		User user = new User(login, password, nom, nomFamille, prenom, type, number, mail,5);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		UserRepository repo = ctx.getBean(UserRepository.class);
		request.getSession().setAttribute("loggedInUser", session);
		request.getSession().setAttribute("username", user.getPrenom());
		request.getSession().setAttribute("user", user);

		System.out.println("repoFind : " +user.getId());
		System.out.println("repolog : " +user.getLogin());

		int register=0;
		for (User t : repo.findAll()){
			if(t.getLogin().equals(user.getLogin())){
			user=t;
				register=1;
				break;
			}
		}
		System.out.println(register);
		if (register!=1){repo.save(user);}
		repo.findOne(user.getId());
		System.out.println("login : " +user.getLogin());
		System.out.println("repoFind : " +user.getId());
		System.out.println("repoFind : " +repo.findOne(user.getId()));
		session= request.getSession();
		System.out.println("username : " +session.getId());
		session.getAttribute("numero");
		String returnVal = "eleve_home";


		//model.addAttribute("username", u1.getPrenom());

		return returnVal;

	}

}

