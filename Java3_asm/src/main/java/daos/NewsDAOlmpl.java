package daos;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import jakarta.persistence.Entity;
import entity.News;
import util.Jdbc;

public class NewsDAOlmpl implements NewsDAO {

	@Override
	public List<News> findAll() {
		String sql = "SELECT * FROM NEWS";
		try {
			List<News> entities = new ArrayList<>();
			Object[] values = {};
			ResultSet resultSet = Jdbc.executeQuery(sql, values);
			while (resultSet.next()) {
				News entity = new News();
				entity.setId(resultSet.getString("Id"));
				entity.setTitle(resultSet.getString("Tittle"));
				entity.setContent(resultSet.getString("Content"));;
				entity.setImage(resultSet.getString("Image"));;
				entity.setPosteddate(resultSet.getDate("PostedDate"));;
				entity.setAuthor(resultSet.getString("Author"));;
				entity.setViewcount(resultSet.getInt("ViewCount"));;
				entity.setCategoryid(resultSet.getString("CategoryId"));;
				entity.setHome(resultSet.getBoolean("Home"));;
				entities.add(entity);
			}
			return entities;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public News findById(String id) {
		String sql = "SELECT * FROM NEWS WHERE Id=?";
		try {
			Object[] values = { id };
			ResultSet resultSet = Jdbc.executeQuery(sql, values);
			if (resultSet.next()) {
				News entity = new News();
				entity.setId(resultSet.getString("Id"));
				entity.setTitle(resultSet.getString("Tittle"));
				entity.setContent(resultSet.getString("Content"));;
				entity.setImage(resultSet.getString("Image"));;
				entity.setPosteddate(resultSet.getDate("PostedDate"));;
				entity.setAuthor(resultSet.getString("Author"));;
				entity.setViewcount(resultSet.getInt("ViewCount"));;
				entity.setCategoryid(resultSet.getString("CategoryId"));;
				entity.setHome(resultSet.getBoolean("Home"));;
				return entity;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());	
			return null;}
		throw new RuntimeException("Not found");
	}

	@Override
	public void create(News entity) {
		String sql = "INSERT INTO NEWS(Id, Tittle, Content,Image,PostedDate,Author,ViewCount,CategoryId,Home) VALUES(?, ?, ?,?, ?,?, ?,?,?)";
		try {
			Object[] values = { 
					entity.getId(),
					entity.getTitle(),
					entity.getContent(),
					entity.getImage(),
					entity.getPosteddate(),
					entity.getAuthor(),
					entity.getViewcount(),
					entity.getCategoryid(),
					entity.getHome(),

			};
			Jdbc.executeUpdate(sql, values);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
	}

	@Override
	public void update(News entity) {
		String sql = "UPDATE NEWS SET Tittle=?, Content=?,Image=?, PostedDate=?,Author=?, ViewCount=?,CategoryId=?,Home=? WHERE Id=?";
		try {
			Object[] values = { 
					
					entity.getTitle(),
					entity.getContent(),
					entity.getImage(),
					entity.getPosteddate(),
					entity.getAuthor(),
					entity.getViewcount(),
					entity.getCategoryid(),
					entity.getHome(),
					entity.getId(),

			};
			Jdbc.executeUpdate(sql, values);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM NEWS WHERE Id=?";
		try {
			Object[] values = { id };
			Jdbc.executeUpdate(sql, values);
		} catch (Exception e) {
			throw new RuntimeException(e);
}}}
