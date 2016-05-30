package edu.isep.speakisep;

import net.ubilife.spring.customerjdbc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
public class RespoProfilModifyController {
    @RequestMapping(value = "/form_modifierProfil", method = RequestMethod.GET)
    public String form(	HttpServletRequest request,
                           @RequestParam("inputParcours") String inputParcours,
                           @RequestParam("numSalle") String numSalle){
        HttpSession session= request.getSession();
        //Récupération des données du user(connecté)
        User user =(User)session.getAttribute("user");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        ParcoursRepository repo = ctx.getBean(ParcoursRepository.class);
        UserRepository respo = ctx.getBean(UserRepository.class);
        try {
            inputParcours = new String(inputParcours.getBytes("iso-8859-1"), "utf8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        long b = repo.findOne(inputParcours).getId();
        user.setIdParcours(b);
        respo.update(user);
        System.out.println(inputParcours);


        return "respo_profil";
    }


	@RequestMapping("/respo_profil_modify")

	public String Profil_respo(
			HttpServletRequest request
	){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ParcoursRepository repo=ctx.getBean(ParcoursRepository.class);
		request.setAttribute("parcours", repo.findAll());
		System.out.println("a  :"+repo.findAll());
		HttpSession session= request.getSession();
		System.out.println("bblblblbl :"+session. getId());
		System.out.println("dfdfdf :"+(repo.findOne("Génie logiciel")).getId());
		for (Parcours t : repo.findAll()){
			System.out.println(t.getId()+","+t.getNomparcours()+",");
		}

		return "respo_profil_modify";
	}
}
