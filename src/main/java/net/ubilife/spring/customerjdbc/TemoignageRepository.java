package net.ubilife.spring.customerjdbc;

import java.util.List;

public interface TemoignageRepository {

	Temoignage findOne(long id);

	Temoignage save(Temoignage temoignage);

	List<Temoignage> findAll();

	int update(Temoignage temoignage);

	int delete (Temoignage temoignage);

	List<Temoignage> findAllBySql(String sql);

}
