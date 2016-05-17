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
public class RespoRepositoryImpl implements RespoRepository {

	@Autowired
	private JdbcOperations jdbc;
	
	private static final String SQL_INSERT = "insert into respo (NOMRESPO, PRENOMRESPO, MAILRESPO, IDPARCOURS) values (?,?,?,?)";
	private static final String SQL_UPDATE = "update respo set NOMRESPO=?, PRENOMRESPO=?, MAILRESPO=?, IDPARCOURS=?";
	private static final String SQL_FIND_ONE = "select * from respo where IDRESPO= ?";
	private static final String SQL_FIND_ALL = "select * from respo order by NOMRESPO";
	private static final String SQL_DELETE_ONE = "delete from respo where IDRESPO=?";
	
	@Override
	public Respo findOne(long id) {
		return jdbc.queryForObject(SQL_FIND_ONE, new RespoRowMapper(), id);
	}

	@Override
	public Respo save(final Respo respo) {
		
		KeyHolder holder = new GeneratedKeyHolder();
		
		int rows = jdbc.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement ps = conn.prepareStatement(SQL_INSERT, new String[]{"IDRESPO"});
				
				ps.setString(1, respo.getNom());
				ps.setString(2, respo.getPrenom());
				ps.setString(3, respo.getMail());
				ps.setLong(4, respo.getIdparcours());
			
				
				return ps;
			}
		}, holder);
		
		if(rows == 1) {	// success, so apply ID to the customer object
			respo.setId((Long)holder.getKey());
			return respo;
		}
		
		return null;
		
	}

	@Override
	public List<Respo> findAll() {
		return jdbc.query(SQL_FIND_ALL, new RespoRowMapper());
	}

	@Override
	public int update(Respo respo) {
		return jdbc.update(SQL_UPDATE, respo.getNom(), respo.getPrenom(), respo.getMail(), respo.getIdparcours());
	}

	@Override
	public int delete(Respo respo) {
		return jdbc.update(SQL_DELETE_ONE, respo.getId());
	}

	private class RespoRowMapper implements RowMapper<Respo> {

		@Override
		public Respo mapRow(ResultSet rs, int row) throws SQLException {
			
			return new Respo(rs.getInt("IDRESPO"), rs.getString("NOMRESPO"), rs.getString("PRENOMRESPO"), rs.getString("MAILRESPO"), rs.getInt("IDPARCOURS")); 
			
		}
		
	}
}
