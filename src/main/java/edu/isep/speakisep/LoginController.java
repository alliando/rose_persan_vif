package edu.isep.speakisep;

import java.io.IOException;
import java.sql.ResultSet;

import javax.naming.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
import edu.isep.speakisep.LDAPObject;

@Controller
public class LoginController extends HttpServlet {
	/**
	 * 
	 */
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
	public String submitForm(Model model, @RequestParam("userId") String userId, @RequestParam("password") String password, @Validated User form, BindingResult result) {
		model.addAttribute("form", form);
		System.out.println( "login : " + userId + " password : " + password );
		LDAPObject ldap = ISEPAuth( userId , password );
		 String returnVal = "eleve_home";
		 if(ldap == null) {
			 returnVal = "form";
		 }
		 else{
			 model.addAttribute("form", form);
			 returnVal= "eleve_home";
		 }
		 return returnVal;
	}
	
	
	
	/*private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
    
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		String login = request.getParameter("log");
		String password = request.getParameter("pass");
		
		System.out.println( "login : " + login + " password : " + password );
		
		LDAPObject result = ISEPAuth( login , password );
		
		if ( result == null ){
			response.sendRedirect("connexion.html");
			return;
		}
		
		String type = result.getType(); 
		
		if ( type.equals("eleve")){
			response.sendRedirect("accueil_eleve.html");
		} else if ( type.equals("client") ){
			response.sendRedirect("accueil_client.html");
		} else if ( type.equals("tuteur") ){
			
		} else if ( type.equals("professeur") ){
			response.sendRedirect("accueil_prof.html");
		} else {
			
		} 
		
		System.out.println(result);
						
		String sql = "INSERT INTO User VALUES ('Zara', 'Ali', 18, 'penis')";
		
		ResultSet resultSet = Config.sharedInstance().executeSQL(sql);
		
		if ( resultSet == null ){
			System.out.println("prout");
		}
		
		
	}*/
	
	
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
