package net.ubilife.spring.customerjdbc;

import java.util.List;

public interface EtudiantRepository {

	Etudiant findOne(long id);
	
	Etudiant save(Etudiant cust);
	
	List<Etudiant> findAll();
	
	int update(Etudiant cust);
	
	int delete (Etudiant cust);
	
}
