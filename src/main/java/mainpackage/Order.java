package mainpackage;

import java.time.LocalDateTime;
import java.util.*;

public class Order {
	private String orderName;
	private LocalDateTime orderDate;
	private List<OrderItem> items = new ArrayList<>();
	private boolean completed;

	public Order(String orderName, LocalDateTime date) {
		this.orderName = orderName;
		this.orderDate = date;
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
