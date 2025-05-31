package mainpackage;

import java.util.*;

public class StockManager {

	private Map<String, Integer> stock = new HashMap<>();

	private final Map<String, Integer> thresholds = new HashMap<>();

	public void addItem(String itemName, int quantity) {
		stock.put(itemName, stock.getOrDefault(itemName, 0) + quantity);
	}

	public void removeItem(String itemName, int quantity) {
		if (!stock.containsKey(itemName) || stock.get(itemName) < quantity) {
			throw new IllegalArgumentException("Not enough stock for item: " + itemName);
		}
		stock.put(itemName, stock.get(itemName) - quantity);
	}

	public void checkStockLevels() {
		System.out.println("Current Stock Levels:");
		for (Map.Entry<String, Integer> entry : stock.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public boolean StockDetected(String itemName, int quantity) {
		return stock.getOrDefault(itemName, 0) >= quantity;
	}

	public int getStockLevel(String itemName) {
		return stock.getOrDefault(itemName, 0);
	}

	public void startMonitoring() {
		checkStockLevels();
	}

	public void setThreshold(String itemName, int threshold) {
		thresholds.put(itemName, threshold);
	}

	public int getThreshold(String itemName) {
		return thresholds.getOrDefault(itemName, 0);
	}

}
