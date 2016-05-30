package net.ubilife.spring.customerjdbc;

import java.util.List;

public interface ParcoursRepository {

	Parcours findOne(long id);

	Parcours findOne(String nomParcours);

	Parcours save(Parcours parcours);
	
	List<Parcours> findAll();
	
	int update(Parcours parcours);
	
	int delete (Parcours parcours);
	
}
