package net.ubilife.spring.customerjdbc;

public class Admin {

	private long id;
	private String mail;
	
	public Admin(){	
	}
	
	public Admin(int id, String mail){
		super();
		this.id=id;
		this.mail=mail;
	}
	
	public Admin(String mail){
		super();
		this.mail=mail;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
