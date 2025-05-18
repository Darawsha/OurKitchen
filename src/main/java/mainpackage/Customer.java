package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String username;
	private String password;
	private boolean loggedIn;
	private List<Order> orderHistory = new ArrayList<>();
	private Order currentOrder;

	public Customer(String username, String password) {
		this.username = username;
		this.password = password;
		this.loggedIn = false;
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

	public void setCurrentOrder(Order order) {
		this.currentOrder = order;
	}

	public Order getCurrentOrder() {
		return currentOrder;
	}

	public void addOrderToHistory(Order order) {
		orderHistory.add(order);
	}

	public List<Order> getOrderHistory() {
		return orderHistory;
	}
}
