package daos;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entity.User;
import util.Jdbc;

public class UserDAOlmpl implements UserDAO {

	@Override
	public List<User> findAll() {
		String sql = "SELECT * FROM User";
		try {
			List<User> entities = new ArrayList<>();
			Object[] values = {};
			ResultSet resultSet = Jdbc.executeQuery(sql, values);
			while (resultSet.next()) {
				User entity = new User();
				entity.setId(resultSet.getString("Id"));
				entity.setPassword(resultSet.getString("Password"));
				entity.setFullname(resultSet.getString("Fullname"));
				entity.setBirthday(resultSet.getDate("Birthday"));
				entity.setGender(resultSet.getBoolean("Gender"));
				entity.setMobile(resultSet.getString("Mobile"));
				entity.setEmail(resultSet.getString("Email"));
				entity.setRole(resultSet.getBoolean("Role"));
				entities.add(entity);
			}
			return entities;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public User findById(String id) {
		String sql = "SELECT * FROM Departments WHERE Id=?";
		try {
			Object[] values = { id };
			ResultSet resultSet = Jdbc.executeQuery(sql, values);
			if (resultSet.next()) {
				User entity = new User();
				entity.setId(resultSet.getString("Id"));
				entity.setPassword(resultSet.getString("Password"));
				entity.setFullname(resultSet.getString("Fullname"));
				entity.setBirthday(resultSet.getDate("Birthday"));
				entity.setGender(resultSet.getBoolean("Gender"));
				entity.setMobile(resultSet.getString("Mobile"));
				entity.setEmail(resultSet.getString("Email"));
				entity.setRole(resultSet.getBoolean("Role"));
				return entity;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());	
			return null;}
		throw new RuntimeException("Not found");
	}

	@Override
	public void create(User item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

}
