package entity;

public class User {
	private Integer userid;
	private String firstname;
	private String lastname;
	private String usernamne;
	private String password;
	
	
	public User() {
		super();
	}

	public User(String firstname, String lastname, String usernamne, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.usernamne = usernamne;
		this.password = password;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsernamne() {
		return usernamne;
	}
	public void setUsernamne(String usernamne) {
		this.usernamne = usernamne;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
