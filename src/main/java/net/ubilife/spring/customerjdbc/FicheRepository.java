package net.ubilife.spring.customerjdbc;

import java.util.List;

public interface FicheRepository {

	Fiche findOne(long id);
	
	Fiche save(Fiche fiche);
	
	List< Fiche> findAll();
	
	int update(Fiche  fiche);
	
	int delete (Fiche fiche);
	
}
