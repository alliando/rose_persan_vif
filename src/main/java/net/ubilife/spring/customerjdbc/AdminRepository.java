package net.ubilife.spring.customerjdbc;

import java.util.List;

public interface AdminRepository {

	Admin findOne(long id);
	
	Admin save(Admin admin);
	
	List<Admin> findAll();
	
	int update(Admin admin);
	
	int delete (Admin admin);
	
}
