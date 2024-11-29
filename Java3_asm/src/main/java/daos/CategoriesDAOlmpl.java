package daos;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Categories;
import entity.News;
import util.Jdbc;

public class CategoriesDAOlmpl implements CategoriesDAO{

	@Override
	public List<Categories> findAll() {
		String sql = "SELECT * FROM CATEGORIES";
		try {
			List<Categories> entities = new ArrayList<>();
			Object[] values = {};
			ResultSet resultSet = Jdbc.executeQuery(sql, values);
			while (resultSet.next()) {
				Categories entity = new Categories();
				entity.setId(resultSet.getString("Id"));
				entity.setName(resultSet.getString("Name"));
				entities.add(entity);
			}
			return entities;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	@Override
	public Categories findById(Categories id) {
		String sql = "SELECT * FROM CATEGORIES WHERE Id=?";
	try {
		Object[] values = { id };
			ResultSet resultSet = Jdbc.executeQuery(sql, values);
		if (resultSet.next()) {
			Categories entity = new Categories();
				entity.setId(resultSet.getString("Id"));
				entity.setName(resultSet.getString("Name"));
				return entity;
			}
		} catch (Exception e) {
		System.out.println(e.getMessage());	
			return null;}
		throw new RuntimeException("Not found");

	}


	@Override
	public void create(Categories entity) {
		String sql = "INSERT INTO CATEGORIES(Id, Name) VALUES(?, ?)";
		try {
			Object[] values = { 
					entity.getId(),
					entity.getName(),

			};
			Jdbc.executeUpdate(sql, values);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void update(Categories entity) {
		String sql = "UPDATE CATEGORIES SET Name=? WHERE Id=?";
		try {
			Object[] values = { 
					entity.getName(),
					entity.getId(),
			};
			Jdbc.executeUpdate(sql, values);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void deleteById(String id) {
		String sql = "DELETE FROM CATEGORIES WHERE Id=?";
		try {
			Object[] values = { id };
			Jdbc.executeUpdate(sql, values);
		} catch (Exception e) {
			throw new RuntimeException(e);
		
		
	}
		
	}

	

	

}
