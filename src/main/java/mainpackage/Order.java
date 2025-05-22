package mainpackage;

import java.util.*;

public class Order {
	private String orderName;
	private Date orderDate;
	private List<OrderItem> items = new ArrayList<>();
	private boolean completed;

	public Order(String orderName, Date orderDate) {
		this.orderName = orderName;
		this.orderDate = orderDate;
		this.completed = false;
	}

	public void addItem(String name, int quantity) {
		items.add(new OrderItem(name, quantity));
	}

	public void completeOrder() {
		this.completed = true;
	}

	public boolean isCompleted() {
		return completed;
	}


}
