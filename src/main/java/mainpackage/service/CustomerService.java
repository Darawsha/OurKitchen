package mainpackage.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.concurrent.ConcurrentHashMap;

import mainpackage.Order;
import mainpackage.model.*;

import java.util.List;
import java.util.Map;

public class CustomerService {

	private final Map<String, Customer> customers = new ConcurrentHashMap<>();
	private Customer currentCustomer;

	public void loginCustomer(String userName, String password) {
		if (userName == null || password == null) {
			throw new IllegalArgumentException("Username and password must not be null");
		}
		Customer customer = customers.get(userName);
		if (customer != null && customer.getPassword().equals(password)) {
			customer.setLoggedIn(true);
			currentCustomer = customer;
		} else {
			throw new IllegalArgumentException("Invalid username or password");
		}
	}

	public boolean customerIsLoggedIn(String userName) {
		if (userName == null) {
			throw new IllegalArgumentException("Username must not be null");
		}
		Customer customer = customers.get(userName);
		if (customer != null) {
			return customer.isLoggedIn();
		} else {
			throw new IllegalArgumentException("Customer not found");
		}
	}

	public void registerCustomer(String username, String password) {
		if (username == null || password == null) {
			throw new IllegalArgumentException("Username and password must not be null");
		}
		if (customers.containsKey(username)) {
			throw new IllegalArgumentException("Username already exists");
		}
		customers.put(username, new Customer(username, password, true));
	}

	public void createOrder(String orderName, String isoDateStr) {
		if (currentCustomer == null) {
			throw new IllegalStateException("No customer logged in");
		}
		if (orderName == null || isoDateStr == null) {
			throw new IllegalArgumentException("Order name and date must not be null");
		}
		try {
			LocalDateTime date = LocalDateTime.parse(isoDateStr, DateTimeFormatter.ISO_DATE_TIME);
			Order order = new Order(orderName, date);
			currentCustomer.setCurrentOrder(order);
		} catch (DateTimeParseException e) {
			throw new IllegalArgumentException("Invalid date format. Use ISO format: yyyy-MM-dd'T'HH:mm:ss");
		}
	}

	public void addOrderItem(String itemName, int quantity) {
		if (currentCustomer == null) {
			throw new IllegalStateException("No customer logged in");
		}
		if (itemName == null || quantity <= 0) {
			throw new IllegalArgumentException("Item name must not be null and quantity must be greater than 0");
		}
		Order order = currentCustomer.getCurrentOrder();
		if (order == null) {
			throw new IllegalStateException("No current order");
		}
		order.addItem(itemName, quantity);
	}

	public void completeOrder() {
		if (currentCustomer == null) {
			throw new IllegalStateException("No customer logged in");
		}
		Order order = currentCustomer.getCurrentOrder();
		if (order == null) {
			throw new IllegalStateException("No current order to complete");
		}
		order.completeOrder();
		currentCustomer.addOrderToHistory(order);
		currentCustomer.setCurrentOrder(null);
	}

	public boolean isOrderCompleted() {
		if (currentCustomer == null) {
			throw new IllegalStateException("No customer logged in");
		}
		List<Order> history = currentCustomer.getOrderHistory();
		return !history.isEmpty() && history.get(history.size() - 1).isCompleted();
	}


}
