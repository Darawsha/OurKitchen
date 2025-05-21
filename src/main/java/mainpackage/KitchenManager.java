package mainpackage;

public class KitchenManager {
	private String username;
	private String password;
	private boolean isLoggedIn;

	public KitchenManager(String username, String password) {
		this.username = username;
		this.password = password;
		this.isLoggedIn = false;
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

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}

}