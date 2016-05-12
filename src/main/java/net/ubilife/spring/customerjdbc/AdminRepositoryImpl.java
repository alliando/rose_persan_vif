package net.ubilife.spring.customerjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepositoryImpl implements AdminRepository {

	@Autowired
	private JdbcOperations jdbc;
	
	private static final String SQL_INSERT = "insert into admin (MAILADMIN) values (?)";
	private static final String SQL_UPDATE = "update admin set MAILADMIN=?";
	private static final String SQL_FIND_ONE = "select * from admin where IDADMIN= ?";
	private static final String SQL_FIND_ALL = "select * from admin order by IDADMIN";
	private static final String SQL_DELETE_ONE = "delete from admin where IDADMIN=?";
	
	@Override
	public Admin findOne(long id) {
		return jdbc.queryForObject(SQL_FIND_ONE, new AdminRowMapper(), id);
	}

	@Override
	public Admin save(final Admin admin) {
		
		KeyHolder holder = new GeneratedKeyHolder();
		
		int rows = jdbc.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement ps = conn.prepareStatement(SQL_INSERT, new String[]{"IDADMIN"});
				
				ps.setString(1, admin.getMail());
			
				
				return ps;
			}
		}, holder);
		
		if(rows == 1) {	// success, so apply ID to the customer object
			admin.setId((Long)holder.getKey());
			return admin;
		}
		
		return null;
		
	}

	@Override
	public List<Admin> findAll() {
		return jdbc.query(SQL_FIND_ALL, new AdminRowMapper());
	}

	@Override
	public int update(Admin admin) {
		return jdbc.update(SQL_UPDATE, admin.getMail());
	}

	@Override
	public int delete(Admin admin) {
		return jdbc.update(SQL_DELETE_ONE, admin.getId());
	}

	private class AdminRowMapper implements RowMapper<Admin> {

		@Override
		public Admin mapRow(ResultSet rs, int row) throws SQLException {
			
			return new Admin(rs.getInt("IDADMIN"), rs.getString("MAILADMIN")); 
			
		}
		
	}
}
