package edu.isep.speakisep;

import net.ubilife.spring.customerjdbc.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
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
				@RequestParam("adresse") String adresse,
				@RequestParam(value = "photo", required = false) MultipartFile photo)

		{
			HttpSession session= request.getSession();
			//Récupération des données user/fiche
			User user =(User)session.getAttribute("user");
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
			/*if (!photo.equals("No file Uploaded")){
	        	fiche.setPhoto(photo);
	        	repoF.updateOne(fiche);
	        	}*/

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
			
			MultipartFile file = null;
			if(photo != null)
				file = photo;
			

				String filename = null;
				String full_file_name = null;
				String imagePath = "/Users/SophieTonnoir/GitHub/rose_persan_vif5/src/main/webapp/img/";
				filename = file.getOriginalFilename();
				String[] tmpFile = filename.split("\\.");
				String extension = tmpFile[tmpFile.length-1].toLowerCase();

					try {
						full_file_name = user.getLogin() + "." + extension;
						BufferedOutputStream stream = new BufferedOutputStream(
								new FileOutputStream(new File( imagePath+ full_file_name)));
		                FileCopyUtils.copy(file.getInputStream(), stream);
						stream.close();

						 fiche.setPhoto(full_file_name);
						 //System.out.println("a  :"+full_file_name);
						 repoF.updateOne(fiche);
						
					}
					catch (Exception e) {
						
					}



			return "redirect:eleve_profil_validation";
		}
	@RequestMapping("/eleve_profil_modify")

	public String Profil_respo(
	){

		return "eleve_profil_modify";
	}
}
