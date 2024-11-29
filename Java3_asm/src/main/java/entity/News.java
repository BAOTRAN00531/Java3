package entity;
import java.util.Date;


public class News {
	String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getPosteddate() {
		return posteddate;
	}
	public void setPosteddate(Date posteddate) {
		this.posteddate = posteddate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public News() {
		super();
	}
	public News(String id, String title, String content, String image, Date posteddate, String author,
			Integer viewcount, String categoryid, Boolean home) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.image = image;
		this.posteddate = posteddate;
		this.author = author;
		this.viewcount = viewcount;
		this.categoryid = categoryid;
		this.home = home;
	}
	public Integer getViewcount() {
		return viewcount;
	}
	public void setViewcount(Integer viewcount) {
		this.viewcount = viewcount;
	}
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public Boolean getHome() {
		return home;
	}
	public void setHome(Boolean home) {
		this.home = home;
	}
	String title;
	String content;
	String image;
	Date posteddate;
	String author;
	Integer viewcount;
	String categoryid;
	Boolean home;
}
