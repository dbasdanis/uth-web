package jpa.dbasdanis;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accounts {
	@Id
	private String username;
	private String password;
	
	public String getName() {
		return username;
	}
	public void setName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}