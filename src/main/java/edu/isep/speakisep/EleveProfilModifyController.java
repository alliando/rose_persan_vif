package edu.isep.speakisep;

import net.ubilife.spring.customerjdbc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
public class EleveProfilModifyController {
	@RequestMapping(value = "/eleve_modifierProfil", method = RequestMethod.POST)
	public String form(HttpServletRequest request,
			//@RequestParam("lmotiv") String lmotiv,
			//@RequestParam("cv") String cv,
			@RequestParam("actextra") String actextra,
			@RequestParam("competences") String competences,
			@RequestParam("notes") String notes,
			@RequestParam("apprenti") String apprenti,
			@RequestParam("adresse") String adresse)

	{
		HttpSession session= request.getSession();
		//Récupération des données user/fiche
		Fiche fiche =(Fiche)session.getAttribute("fiche");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		FicheRepository repoF = ctx.getBean(FicheRepository.class);
		//Conversion en UTF-8
		try {
			adresse = new String(adresse.getBytes("iso-8859-1"), "utf8");
			apprenti = new String(apprenti.getBytes("iso-8859-1"), "utf8");
			competences = new String(competences.getBytes("iso-8859-1"), "utf8");
			actextra = new String(actextra.getBytes("iso-8859-1"), "utf8");
			notes = new String(notes.getBytes("iso-8859-1"), "utf8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		if(!apprenti.equals("")){
			fiche.setApprenti(apprenti);
			repoF.updateOne(fiche);}


		if(!competences.equals("")){
			fiche.setCompetences(competences);
			repoF.updateOne(fiche);}


		if(!actextra.equals("")){
			fiche.setActextra(actextra);
			repoF.updateOne(fiche);}

		if(!adresse.equals("")){
			fiche.setAdresse(adresse);
			repoF.updateOne(fiche);}


		if(!notes.equals("")){
			fiche.setNotes(notes);
			repoF.updateOne(fiche);}



		return "redirect:eleve_profil";
	}
	
	@RequestMapping("/eleve_profil_modify")

	public String Profil_respo(){

		return "eleve_profil_modify";
	}
}
