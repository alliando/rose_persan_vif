package net.ubilife.spring.customerjdbc;

public class Respo {
	private long id;
	private String nom;
	private String prenom;
	private String mail;
	private int idparcours;
	
	public Respo(){	
	}
	
	public Respo(int id, String nom, String prenom, String mail, int idparcours){
		super();
		this.id=id;
		this.nom=nom;
		this.prenom=prenom;
		this.mail=mail;
		this.idparcours=idparcours;
	}
	
	public Respo(String nom, String prenom, String mail, int idparcours){
		super();
		this.nom=nom;
		this.prenom=prenom;
		this.mail=mail;
		this.idparcours=idparcours;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getIdparcours() {
		return idparcours;
	}

	public void setIdparcours(int idparcours) {
		this.idparcours = idparcours;
	}
}
