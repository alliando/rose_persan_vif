package net.ubilife.spring.customerjdbc;

import java.util.List;

public interface ModuleRepository {

	Module findOne(int id);

	Module save(Module module);

	List<Module> findAll();

	int update(Module module);

	int delete (Module module);

	List<Module> findAllBySql(String sql);

}
