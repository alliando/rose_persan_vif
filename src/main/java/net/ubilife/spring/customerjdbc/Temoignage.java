package net.ubilife.spring.customerjdbc;

public class Temoignage {

	private long id;
	private String nomtem;
	private String descriptem;
	private int userId;//eleve
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getNomparcours() {
		return nomparcours;
	}

	public void setNomparcours(String nomparcours) {
		this.nomparcours = nomparcours;
	}

	private String nomparcours;
	
	public Temoignage(){	
	}
	
	public Temoignage(int id, String nomtem, String descriptem, int userId, String nomparcours){
		super();
		this.id=id;
		this.nomtem=nomtem;
		this.descriptem=descriptem;
		this.userId=userId;
		this.nomparcours=nomparcours;
	}
	
	public Temoignage(String nomtem, String descriptem, int userId, String nomparcours){
		super();
		this.nomtem=nomtem;
		this.descriptem=descriptem;
		this.userId=userId;
		this.nomparcours=nomparcours;
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

	public int getIdeleve() {
		return userId;
	}

	public void setIdeleve(int ideleve) {
		this.userId = ideleve;
	}

}
