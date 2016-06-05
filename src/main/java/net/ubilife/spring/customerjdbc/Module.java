package net.ubilife.spring.customerjdbc;

public class Module {

	private long id;
	private String nomuniv;
	private String description;
	private int userId;
	private String lien;
	private String statut;
	private String commentaire;

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public int getUserId() {
		return userId;
	}
	
	public String getNomuniv() {
		return nomuniv;
	}

	public void setNomuniv(String nomuniv) {
		this.nomuniv = nomuniv;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Module(){	
	}

	public Module(int id, String nomuniv, String description, String lien, String statut, String commentaire, int userId){
		super();
		this.id=id;
		this.nomuniv=nomuniv;
		this.description=description;
		this.lien=lien;
		this.statut=statut;
		this.commentaire=commentaire;
		this.userId=userId;
	}

	public Module(String nomuniv, String description, String lien, String statut, String commentaire, int userId){
		super();
		this.nomuniv=nomuniv;
		this.description=description;
		this.lien=lien;
		this.statut=statut;
		this.commentaire=commentaire;
		this.userId=userId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String toString()
	{
		return "id = " + id + " nomuniv = " + nomuniv + " description = " + description + " userId = " + userId + " lien = " + lien +" statut = " + statut +"commentaire = " + commentaire;
	}

}
