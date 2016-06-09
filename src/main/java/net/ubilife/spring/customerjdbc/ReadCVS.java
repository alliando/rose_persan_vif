package net.ubilife.spring.customerjdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by Frost_000 on 04/06/2016.
 */
public class ReadCVS {
   private String numero;
   private  String nom;
   private String etape;
   private String promotion;
   private String statut;
   private String apprentissage;


    public void run(User user) {

        String csvFile = "/Users/Frost_000/code/isep/speakIsep/rose_persan_vif/src/main/java/Parcours_Ingenieur_Architecte_des_Systemes_d_Informationn.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

//Récupération des repository
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        ParcoursRepository repoP=ctx.getBean(ParcoursRepository.class);
        FicheRepository repoF=ctx.getBean(FicheRepository.class);

        try {
            br = new BufferedReader(new FileReader(csvFile));
            String nomParcours=br.readLine().split(";")[1];
                nomParcours=nomParcours.split("Promo")[0];
            int register=0;
            for(Parcours parcours:repoP.findAll()){
                if (parcours.getNomparcours().equals(nomParcours)){
                   register=1;
                    break;
                }
            }

            //Si le parcours n'est pas inscrit, on l'enregistre

            if (register!=1){

                Parcours parcours=new Parcours(nomParcours,"",2);
                repoP.save(parcours);
            }
            br.readLine();
            Map<String, String[]> map = new HashMap<String, String[]>();
            while (((line = br.readLine()) != null)) {
                String[] data = line.split(cvsSplitBy);
                String[] b;
                if (!data[0].trim().equals("Total")){
                    numero=data[0].trim();
                    nom=data[1].trim();
                    etape=data[2].trim();
                    promotion=data[3].trim();
                    statut=data[4].trim();
                    apprentissage=data[5].trim();
                        if(numero.equals(user.getNumber())) {
                            Fiche fiche = repoF.findOne(user);
                            System.out.println(fiche.getUserId());
                            fiche.setApprenti(apprentissage);
                            fiche.setStatut(statut);
                            fiche.setEtape(etape);
                            fiche.setPromotion(promotion);
                            repoF.updateOne(fiche);
                        }
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Done");
    }

}
