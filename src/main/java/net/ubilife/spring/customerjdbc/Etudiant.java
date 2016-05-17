package net.ubilife.spring.customerjdbc;

public class Etudiant {
	public void setIdparcours(int idparcours) {
		this.idparcours = idparcours;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setEtape(String etape) {
		this.etape = etape;
	}

	public void setPromo(int promo) {
		this.promo = promo;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	private long id;
	private int numero;
	private String nom;
	private String prenom;
	private String etape;
	private int promo;
	private String mail;
	private String mdp;
	private int idparcours;
	
	public Etudiant(){	
	}
	
	public Etudiant(int id, int numero, String nom, String prenom, String etape, int promo, String mail, String mdp, int idparcours){
		super();
		this.id=id;
		this.nom=nom;
		this.prenom=prenom;
		this.etape=etape;
		this.promo=promo;
		this.mail=mail;
		this.mdp=mdp;
		this.idparcours=idparcours;
	}
	
	public Etudiant(int numero, String nom, String prenom, String etape, int promo, String mail, String mdp, int idparcours){
		super();
		this.numero=numero;
		this.nom=nom;
		this.prenom=prenom;
		this.etape=etape;
		this.promo=promo;
		this.mail=mail;
		this.mdp=mdp;
		this.idparcours=idparcours;
	}
	
	public long getId(){
		return id;
	}
	
	public long getNumero(){
		return numero;
	}
	
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	public String getEtape(){
		return etape;
	}
	
	public long getPromo(){
		return promo;
	}
	
	public String getMail(){
		return mail;
	}
	
	public String getMdp(){
		return mdp;
	}
	
	public long getIdparcours(){
		return idparcours;
	}
	

	
	

}
