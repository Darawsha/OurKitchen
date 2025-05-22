package mainpackage.model;

import java.util.ArrayList;
import java.util.List;

import mainpackage.Order;

public class Customer extends Person{

	public Customer(String username, String password, boolean loggedIn) {
		super(username, password, loggedIn);
	}

	private List<Order> orderHistory = new ArrayList<>();
	private Order currentOrder;

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
