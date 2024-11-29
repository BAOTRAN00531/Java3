package daos;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entity.Newsletters;
import jakarta.persistence.Entity;
import util.Jdbc;

public class NewslettersDAOlmpl implements NewslettersDAO {

	@Override
	public List<Newsletters> findAll() {
		String sql = "SELECT * FROM NEWSLETTERS";
		try {
			List<Newsletters> entities = new ArrayList<>();
			Object[] values = {};
			ResultSet resultSet = Jdbc.executeQuery(sql, values);
			while (resultSet.next()) {
				Newsletters entity = new Newsletters();
				entity.setEmail(resultSet.getString("Email"));
				entity.setEnabled(resultSet.getBoolean("Enabled"));
				entities.add(entity);
			}
			return entities;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Newsletters findById(String id) {
		String sql = "SELECT * FROM NEWSLETTERS WHERE Email=?";
		try {
			Object[] values = { id };
			ResultSet resultSet = Jdbc.executeQuery(sql, values);
			if (resultSet.next()) {
				Newsletters entity = new Newsletters();
				entity.setEmail(resultSet.getString("Email"));
				entity.setEnabled(resultSet.getBoolean("Enabled"));
				return entity;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());	
			return null;}
		throw new RuntimeException("Not found");
	}

	@Override
	public void create(Newsletters entity) {
		String sql = "INSERT INTO NEWSLETTERS(Email, Enabled) VALUES(?, ?)";
		try {
			Object[] values = { 
					entity.getEmail(),
					entity.getEnabled(),
					

			};
			Jdbc.executeUpdate(sql, values);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void update(Newsletters entity) {
		String sql = "UPDATE NEWSLETTERS SET Enabled=? WHERE Email=?";
		try {
			Object[] values = { 
					entity.getEmail(),
					entity.getEnabled(),
			};
			Jdbc.executeUpdate(sql, values);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void deleteById(String id) {
		String sql = "DELETE FROM NEWSLETTERS WHERE Email=?";
		try {
			Object[] values = { id };
			Jdbc.executeUpdate(sql, values);
		} catch (Exception e) {
			throw new RuntimeException(e);
		
		
	}
		
	}

}
