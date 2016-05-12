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
public class ParcoursRepositoryImpl implements ParcoursRepository {

	@Autowired
	private JdbcOperations jdbc;
	
	private static final String SQL_INSERT = "insert into parcours (NOMPARCOURS, DESCRIPTION, IDRESPO, IDTEMOIGNAGE) values (?,?,?,?)";
	private static final String SQL_UPDATE = "update parcours set NOMPARCOURS=?, DESCRIPTION=?, IDRESPO=?, IDTEMOIGNAGE=?";
	private static final String SQL_FIND_ONE = "select * from parcours where IDPARCOURS= ?";
	private static final String SQL_FIND_ALL = "select * from parcours order by NOMPARCOURS";
	private static final String SQL_DELETE_ONE = "delete from parcours where IDPARCOURS=?";
	
	@Override
	public Parcours findOne(long id) {
		return jdbc.queryForObject(SQL_FIND_ONE, new ParcoursRowMapper(), id);
	}

	@Override
	public Parcours save(final Parcours parcours) {
		
		KeyHolder holder = new GeneratedKeyHolder();
		
		int rows = jdbc.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement ps = conn.prepareStatement(SQL_INSERT, new String[]{"IDPARCOURS"});
				
				ps.setString(1, parcours.getNomparcours());
				ps.setString(2, parcours.getDescription());
				ps.setLong(3, parcours.getIdrespo());
				ps.setLong(4, parcours.getIdtemoignage());
			
				
				return ps;
			}
		}, holder);
		
		if(rows == 1) {	// success, so apply ID to the customer object
			parcours.setId((Long)holder.getKey());
			return parcours;
		}
		
		return null;
		
	}

	@Override
	public List<Parcours> findAll() {
		return jdbc.query(SQL_FIND_ALL, new ParcoursRowMapper());
	}

	@Override
	public int update(Parcours parcours) {
		return jdbc.update(SQL_UPDATE, parcours.getNomparcours(), parcours.getDescription(), parcours.getIdrespo(), parcours.getIdtemoignage());
	}

	@Override
	public int delete(Parcours parcours) {
		return jdbc.update(SQL_DELETE_ONE, parcours.getId());
	}

	private class ParcoursRowMapper implements RowMapper<Parcours> {

		@Override
		public Parcours mapRow(ResultSet rs, int row) throws SQLException {
			
			return new Parcours(rs.getInt("IDPARCOURS"), rs.getString("NOMPARCOURS"), rs.getString("DESCRIPTION"), rs.getInt("IDRESPO"), rs.getInt("IDTEMOIGNAGE")); 
			
		}
		
	}
}
