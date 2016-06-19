package net.ubilife.spring.customerjdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;

public class ReadCVS {
   private String numero;
   private  String nom;
   private String etape;
   private String promotion;
   private String statut;
   private String apprentissage;


    public void run(User user) {

        String csvFile = "Parcours_Ingenieur_Architecte_des_Systemes_d_Informationn.csv";
        String folder = "img";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";
        Class myClass=getClass();

//Récupération des repository
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        ParcoursRepository repoP=ctx.getBean(ParcoursRepository.class);
        FicheRepository repoF=ctx.getBean(FicheRepository.class);
        UserRepository repoUser=ctx.getBean(UserRepository.class);

        try {
            ClassLoader loader=myClass.getClassLoader();
            System.out.println(loader.getResource(csvFile).getPath());
            System.out.println((loader.getResource("img")));
            br = new BufferedReader(new FileReader(loader.getResource(csvFile).getPath()));
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
                Parcours parcours=new Parcours(nomParcours,"");
                repoP.save(parcours);
            }
            br.readLine();
            while (((line = br.readLine()) != null)) {
                String[] data = line.split(cvsSplitBy);
                if (!data[0].trim().equals("Total")){
                    numero=data[0].trim();
                    nom=data[1].trim();
                    etape=data[2].trim();
                    promotion=data[3].trim();
                    statut=data[4].trim();
                    apprentissage=data[5].trim();
                        if(numero.equals(user.getNumber())) {
                            Fiche fiche = repoF.findOne(user);
                            fiche.setApprenti(apprentissage);
                            fiche.setStatut(statut);
                            fiche.setEtape(etape);
                            fiche.setPromotion(promotion);
                            repoF.updateOne(fiche);
                            user.setIdParcours(repoP.findOne(nomParcours).getId());
                            repoUser.updateOne(user);
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
