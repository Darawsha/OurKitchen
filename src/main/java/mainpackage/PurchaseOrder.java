package mainpackage;

import java.util.*;

public class PurchaseOrder {
	private String itemName;
	private int quantity;
	private Date orderDate;

	public PurchaseOrder(String itemName, int quantity, Date orderDate) {
		this.itemName = itemName;
		this.quantity = quantity;
		this.orderDate = orderDate;
	}

	public String getItemName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public Date getOrderDate() {
		return orderDate;
	}
}
