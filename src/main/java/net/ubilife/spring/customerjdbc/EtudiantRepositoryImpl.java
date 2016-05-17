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
public class EtudiantRepositoryImpl implements EtudiantRepository {

	@Autowired
	private JdbcOperations jdbc;
	
	private static final String SQL_INSERT = "insert into etudiant (NUMELEVE, NOMELEVE, PRENOMELEVE, ETAPEELEVE, PROMOELEVE, MAILELEVE, MDPELEVE, IDPARCOURS) values (?,?,?,?,?,?,?,?)";
	private static final String SQL_UPDATE = "update etudiant set NUMELEVE=?, NOMELEVE=?, PRENOMELEVE=?, ETAPEELEVE=?, PROMOELEVE=?, MAILELEVE=?, MDPELEVE=?, IDPARCOURS=?";
	private static final String SQL_FIND_ONE = "select * from etudiant where IDELEVE = ?";
	private static final String SQL_FIND_ALL = "select * from etudiant order by NOMELEVE";
	private static final String SQL_DELETE_ONE = "delete from etudiant where IDELEVE=?";
	
	@Override
	public Etudiant findOne(long id) {
		return jdbc.queryForObject(SQL_FIND_ONE, new EtudiantRowMapper(), id);
	}

	@Override
	public Etudiant save(final Etudiant etudiant) {
		
		KeyHolder holder = new GeneratedKeyHolder();
		
		int rows = jdbc.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement ps = conn.prepareStatement(SQL_INSERT, new String[]{"IDELEVE"});
				
				ps.setLong(1, etudiant.getNumero());
				ps.setString(2, etudiant.getNom());
				ps.setString(3, etudiant.getPrenom());
				ps.setString(4, etudiant.getEtape());
				ps.setLong(5, etudiant.getPromo());
				ps.setString(6, etudiant.getMail());
				ps.setString(7, etudiant.getMdp());
				ps.setLong(8, etudiant.getIdparcours());
			
				
				return ps;
			}
		}, holder);
		
		if(rows == 1) {	// success, so apply ID to the customer object
			etudiant.setId((Long)holder.getKey());
			return etudiant;
		}
		
		return null;
		
	}

	@Override
	public List<Etudiant> findAll() {
		return jdbc.query(SQL_FIND_ALL, new EtudiantRowMapper());
	}

	@Override
	public int update(Etudiant etudiant) {
		return jdbc.update(SQL_UPDATE, etudiant.getNumero(), etudiant.getNom(), etudiant.getPrenom(), etudiant.getEtape(), etudiant.getPromo(), etudiant.getMail(), etudiant.getMdp(), etudiant.getIdparcours());
	}

	@Override
	public int delete(Etudiant etudiant) {
		return jdbc.update(SQL_DELETE_ONE, etudiant.getId());
	}

	private class EtudiantRowMapper implements RowMapper<Etudiant> {

		@Override
		public Etudiant mapRow(ResultSet rs, int row) throws SQLException {
			
			return new Etudiant(rs.getInt("IDELEVE"), rs.getInt("NUMELEVE"), rs.getString("NOMELEVE"), rs.getString("PRENOMELEVE"), rs.getString("ETAPEELEVE"), rs.getInt("PROMOELEVE"), rs.getString("MAILELEVE"), rs.getString("MDPELEVE"), rs.getInt("IDPARCOURS")); 
			
		}
		
	}
}
