package entity;

public class Categories {
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Categories(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Categories() {
		super();
	}
	@Override
    public String toString() {
        return "Categories{id='" + id + "', name='" + name + "'}";
    }
	String name;
	String id;
}
