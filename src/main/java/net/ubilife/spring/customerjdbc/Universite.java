package net.ubilife.spring.customerjdbc;

public class Universite {
	private long id;
	private String nomuniv;
	private String descripuniv;
	private String lienuniv;

	public Universite(){	
	}

	public Universite(int id, String nomuniv, String descripuniv, String lienuniv){
		super();
		this.id=id;
		this.nomuniv=nomuniv;
		this.descripuniv=descripuniv;
		this.lienuniv=lienuniv;
	}

	public Universite(String nomuniv, String descripuniv, String lienuniv){
		super();
		this.nomuniv=nomuniv;
		this.descripuniv=descripuniv;
		this.lienuniv=lienuniv;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomuniv() {
		return nomuniv;
	}

	public void setNomuniv(String nomuniv) {
		this.nomuniv = nomuniv;
	}

	public String getDescripuniv() {
		return descripuniv;
	}

	public void setDescripuniv(String descripuniv) {
		this.descripuniv = descripuniv;
	}

	public String getLienuniv() {
		return lienuniv;
	}

	public void setLienuniv(String lienuniv) {
		this.lienuniv = lienuniv;
	}

}
