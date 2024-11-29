package daos;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entity.User;
import jakarta.persistence.Entity;
import util.Jdbc;

public class UserDAOlmpl implements UserDAO {

	@Override
	public List<User> findAll() {
		String sql = "SELECT * FROM USERS";
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
		String sql = "SELECT * FROM USERS WHERE Id=?";
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
	public void create(User entity) {
		String sql = "INSERT INTO USERS(Id, Password, Fullname,Birthday,Gender,Mobile,Email,Role) VALUES(?, ?, ?,?, ?,?, ?,?)";
		try {
			Object[] values = { 
					entity.getId(),
					entity.getPassword(),
					entity.getFullname(),
					entity.getBirthday(),
					entity.getGender(),
					entity.getMobile(),
					entity.getEmail(),
					entity.getRole(),

			};
			Jdbc.executeUpdate(sql, values);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void update(User entity) {
		String sql = "UPDATE USERS SET Password=?, Fullname=?,Birthday=?, Gender=?,Mobile=?, Email=?,Role=? WHERE Id=?";
		try {
			Object[] values = { 
					entity.getPassword(),
					entity.getFullname(),
					entity.getBirthday(),
					entity.getGender(),
					entity.getMobile(),
					entity.getEmail(),
					entity.getRole(),
					entity.getId(),
			};
			Jdbc.executeUpdate(sql, values);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void deleteById(String id) {
		String sql = "DELETE FROM USERS WHERE Id=?";
		try {
			Object[] values = { id };
			Jdbc.executeUpdate(sql, values);
		} catch (Exception e) {
			throw new RuntimeException(e);
		
		
	}

}}
