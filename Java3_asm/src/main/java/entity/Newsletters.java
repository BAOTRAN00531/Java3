package entity;

public class Newsletters {
	
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public Newsletters() {
		super();
	}
	public Newsletters(Boolean enabled, String email) {
		super();
		this.enabled = enabled;
		this.email = email;
	}
	Boolean enabled;
	String email;
}
