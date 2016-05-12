package net.ubilife.spring.customerjdbc;

import java.util.List;

public interface EtudiantRepository {

	Etudiant findOne(long id);
	
	Etudiant save(Etudiant etudiant);
	
	List<Etudiant> findAll();
	
	int update(Etudiant etudiant);
	
	int delete (Etudiant etudiant);
	
}
