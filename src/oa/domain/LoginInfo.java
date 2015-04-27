package oa.domain;

public class LoginInfo {

	private String type;
	private String username;
	private String password;
	public String getType() {
		return type;
	}
	public LoginInfo(String type, String username, String password) {
		
		this.type = type;
		this.username = username;
		this.password = password;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
