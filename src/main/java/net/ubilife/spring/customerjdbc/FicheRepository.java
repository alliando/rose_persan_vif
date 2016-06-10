package net.ubilife.spring.customerjdbc;

import java.util.List;

public interface FicheRepository {

	Fiche findOne(long id);

	Fiche findOne(User user);

	Fiche save(Fiche fiche);

	List< Fiche> findAll();

	int update(Fiche  fiche);

	int updateOne(Fiche fiche);


	int delete (Fiche fiche);

	List<Fiche> findAllBySql(String sql);

}
