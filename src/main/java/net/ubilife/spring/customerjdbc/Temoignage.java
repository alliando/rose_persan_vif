package net.ubilife.spring.customerjdbc;

public class Temoignage {

	private long id;
	private String nomtem;
	private String descriptem;
	private long userId;//eleve
	private String nomparcours;
	private String statut;

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getNomparcours() {
		return nomparcours;
	}

	public void setNomparcours(String nomparcours) {
		this.nomparcours = nomparcours;
	}

	public Temoignage(){	
	}

	public Temoignage(int id, String nomtem, String descriptem, int userId, String nomparcours, String statut){
		super();
		this.id=id;
		this.nomtem=nomtem;
		this.descriptem=descriptem;
		this.userId=userId;
		this.nomparcours=nomparcours;
		this.statut=statut;
	}

	public Temoignage(String nomtem, String descriptem, int userId, String nomparcours, String statut){
		super();
		this.nomtem=nomtem;
		this.descriptem=descriptem;
		this.userId=userId;
		this.nomparcours=nomparcours;
		this.statut=statut;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomtem() {
		return nomtem;
	}

	public void setNomtem(String nomtem) {
		this.nomtem = nomtem;
	}

	public String getDescriptem() {
		return descriptem;
	}

	public void setDescriptem(String descriptem) {
		this.descriptem = descriptem;
	}

	public String toString()
	{
		return "id = " + id + " nomTem = " + nomtem + " descriptem = " + descriptem + " userId = " + userId + " nomParcours = " + nomparcours +" statut = " + statut;
	}

}
