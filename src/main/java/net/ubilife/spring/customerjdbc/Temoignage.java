package net.ubilife.spring.customerjdbc;

public class Temoignage {

	private long id;
	private String nomtem;
	private String descriptem;
	private int userId;//eleve
	
	public Temoignage(){	
	}
	
	public Temoignage(int id, String nomtem, String descriptem, int userId){
		super();
		this.id=id;
		this.nomtem=nomtem;
		this.descriptem=descriptem;
		this.userId=userId;
	}
	
	public Temoignage(String nomtem, String descriptem, int userId){
		super();
		this.nomtem=nomtem;
		this.descriptem=descriptem;
		this.userId=userId;
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
