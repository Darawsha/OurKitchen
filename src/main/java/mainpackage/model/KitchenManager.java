package mainpackage.model;

public class KitchenManager {

	private String username;
	private String password;
	private boolean loggedIn = false;

	// Constructor
	public KitchenManager(String username, String password, boolean loggedIn) {
		this.username = username;
		this.password = password;
		this.loggedIn = loggedIn;
	}



	public String getPassword() {
		return password;
	}


	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

}