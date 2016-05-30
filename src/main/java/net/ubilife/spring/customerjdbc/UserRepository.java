package net.ubilife.spring.customerjdbc;

import java.util.List;

public interface UserRepository {

	User findOne(long id);
	
	User save(User user);
	
	List<User> findAll();
	
	int update(User user);
	
	int delete (User user);

	User findParcours(long id);
	
}
