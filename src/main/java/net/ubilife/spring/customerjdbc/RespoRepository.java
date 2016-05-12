package net.ubilife.spring.customerjdbc;

import java.util.List;

public interface RespoRepository {

	Respo findOne(long id);
	
	Respo save(Respo respo);
	
	List<Respo> findAll();
	
	int update(Respo respo);
	
	int delete (Respo respo);
	
}
