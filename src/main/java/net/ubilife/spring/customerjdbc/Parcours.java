package net.ubilife.spring.customerjdbc;

public class Parcours {
	

	private long id;
	private String nomparcours;
	private String description;
	private int idtemoignage;
	
	public Parcours(){	
	}
	
	public Parcours(int id, String nomparcours, String description, int idtemoignage){
		super();
		this.id=id;
		this.nomparcours=nomparcours;
		this.description=description;
		this.idtemoignage=idtemoignage;
	}
	
	public Parcours(String nomparcours, String description, int idtemoignage){
		super();
		this.nomparcours=nomparcours;
		this.description=description;
		this.idtemoignage=idtemoignage;
	}
	public String toString()
	{
		return "nomparcours = " + nomparcours + " description = " + description + " idtemoignage = " + idtemoignage ;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomparcours() {
		return nomparcours;
	}

	public void setNomparcours(String nomparcours) {
		this.nomparcours = nomparcours;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdtemoignage() {
		return idtemoignage;
	}

	public void setIdtemoignage(int idtemoignage) {
		this.idtemoignage = idtemoignage;
	}


}
