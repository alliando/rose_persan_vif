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
public class TemoignageRepositoryImpl implements TemoignageRepository {

	@Autowired
	private JdbcOperations jdbc;
	
	private static final String SQL_INSERT = "insert into temoignage (NOMTEM, DESCRIPTEM, userId) values (?,?,?)";
	private static final String SQL_UPDATE = "update temoignage set NOMTEM=?, DESCRIPTEM=?, userId=?";
	private static final String SQL_FIND_ONE = "select * from temoignage where IDTEM= ?";
	private static final String SQL_FIND_ALL = "select * from temoignage order by NOMTEM";
	private static final String SQL_DELETE_ONE = "delete from temoignage where IDTEM=?";
	
	@Override
	public Temoignage findOne(long id) {
		return jdbc.queryForObject(SQL_FIND_ONE, new TemoignageRowMapper(), id);
	}

	@Override
	public Temoignage save(final Temoignage temoignage) {
		
		KeyHolder holder = new GeneratedKeyHolder();
		
		int rows = jdbc.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement ps = conn.prepareStatement(SQL_INSERT, new String[]{"IDTEM"});
				
				ps.setString(1, temoignage.getNomtem());
				ps.setString(2, temoignage.getDescriptem());
				ps.setLong(3, temoignage.getIdeleve());
				ps.setString(4, temoignage.getNomparcours());
			
				
				return ps;
			}
		}, holder);
		
		if(rows == 1) {	// success, so apply ID to the customer object
			temoignage.setId((Long)holder.getKey());
			return temoignage;
		}
		
		return null;
		
	}

	@Override
	public List<Temoignage> findAll() {
		return jdbc.query(SQL_FIND_ALL, new TemoignageRowMapper());
	}

	@Override
	public int update(Temoignage temoignage) {
		return jdbc.update(SQL_UPDATE, temoignage.getNomtem(), temoignage.getDescriptem(), temoignage.getIdeleve(),temoignage.getNomparcours());
	}

	@Override
	public int delete(Temoignage temoignage) {
		return jdbc.update(SQL_DELETE_ONE, temoignage.getId());
	}

	private class TemoignageRowMapper implements RowMapper<Temoignage> {

		@Override
		public Temoignage mapRow(ResultSet rs, int row) throws SQLException {
			
			return new Temoignage(rs.getInt("IDTEM"), rs.getString("NOMTEM"), rs.getString("DESCRIPTEM"), rs.getInt("userId"), rs.getString("NOMPARCOURS"));
			
		}
		
	}
}
