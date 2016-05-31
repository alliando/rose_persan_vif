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
public class FicheRepositoryImpl implements FicheRepository {

	@Autowired
	private JdbcOperations jdbc;
	
	private static final String SQL_INSERT = "insert into fiche (NUMSALLE, PHOTO, CV, LMOTIV, ADRESSE, ACTEXTRA, COMPETENCES, NOTES, APPRENTI, userId ) values (?,?,?,?,?,?,?,?,?,?)";
	private static final String SQL_UPDATE = "update fiche set NUMSALLE=?, PHOTO=?, CV=?, LMOTIV=?, ADRESSE=?, ACTEXTRA=?, COMPETENCES=?, NOTES=?, APPRENTI=?, userId=?";
	private static final String SQL_UPDATE_ONE = "update fiche set NUMSALLE=?, PHOTO=?, CV=?, LMOTIV=?, ADRESSE=?, ACTEXTRA=?, COMPETENCES=?, NOTES=?, APPRENTI=?, userId=? WHERE IDFICHE=?";
	private static final String SQL_FIND_ONE = "select * from fiche where IDFICHE= ?";
	private static final String SQL_FIND_ONE_BY_USERID = "select * from fiche where userId= ?";
	private static final String SQL_FIND_ALL = "select * from fiche order by userId";
	private static final String SQL_DELETE_ONE = "delete from fiche where IDFICHE=?";
	
	@Override
	public Fiche findOne(long id) {
		return jdbc.queryForObject(SQL_FIND_ONE, new FicheRowMapper(), id);
	}

	public Fiche findOne(User user) {
		return jdbc.queryForObject(SQL_FIND_ONE_BY_USERID, new FicheRowMapper(), user.getId());
	}

	@Override
	public Fiche save(final Fiche fiche) {
		
		KeyHolder holder = new GeneratedKeyHolder();
		
		int rows = jdbc.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement ps = conn.prepareStatement(SQL_INSERT, new String[]{"IDFICHE"});
				
				ps.setString(1, fiche.getNumsalle());
				ps.setString(2, fiche.getPhoto());
				ps.setString(3, fiche.getCV());
				ps.setString(4, fiche.getLettremotiv());
				ps.setString(5, fiche.getAdresse());
				ps.setString(6, fiche.getActextra());
				ps.setString(7, fiche.getCompetences());
				ps.setString(8, fiche.getNotes());
				ps.setString(9, fiche.getApprenti());
				ps.setLong(10, fiche.getUserId());
			
				
				return ps;
			}
		}, holder);
		
		if(rows == 1) {	// success, so apply ID to the customer object
			fiche.setId((Long)holder.getKey());
			return fiche;
		}
		
		return null;
		
	}

	@Override
	public List<Fiche> findAll() {
		return jdbc.query(SQL_FIND_ALL, new FicheRowMapper());
	}

	@Override
	public int update(Fiche fiche) {
		return jdbc.update(SQL_UPDATE, fiche.getNumsalle(), fiche.getPhoto(), fiche.getCV(), fiche.getLettremotiv(), fiche.getAdresse(), fiche.getActextra(), fiche.getCompetences(), fiche.getNotes(), fiche.getApprenti(), fiche.getUserId());
	}

	@Override
	public int updateOne(Fiche fiche) {
		return jdbc.update(SQL_UPDATE_ONE, fiche.getNumsalle(), fiche.getPhoto(), fiche.getCV(), fiche.getLettremotiv(), fiche.getAdresse(), fiche.getActextra(), fiche.getCompetences(), fiche.getNotes(), fiche.getApprenti(), fiche.getUserId(),fiche.getId());
	}

	@Override
	public int delete(Fiche fiche) {
		return jdbc.update(SQL_DELETE_ONE, fiche.getId());
	}

	private class FicheRowMapper implements RowMapper<Fiche> {

		@Override
		public Fiche mapRow(ResultSet rs, int row) throws SQLException {
			
			return new Fiche(rs.getInt("IDFICHE"), rs.getString("NUMSALLE"), rs.getString("PHOTO"),rs.getString("CV"), rs.getString("LMOTIV"), rs.getString("ADRESSE"), rs.getString("ACTEXTRA"), rs.getString("COMPETENCES"), rs.getString("NOTES"), rs.getString("APPRENTI"), rs.getInt("userId"));
			
		}
		
	}
}
