package mainpackage.service;

import mainpackage.StockManager;

public class StorehouseService {

	private final StockManager stockManager;

	public StorehouseService() {
		this.stockManager = new StockManager();
	}

	public void addIngredient(String name, int quantity, int threshold) {
		validateName(name);
		validatePositiveQuantity(quantity);
		stockManager.addItem(name, quantity);
		stockManager.setThreshold(name, threshold);
	}

	public void useIngredient(String name, int quantity) {
		validateName(name);
		validatePositiveQuantity(quantity);
		stockManager.removeItem(name, quantity);
	}

	public void addIngredientQuantity(String name, int quantity) {
		validateName(name);
		validatePositiveQuantity(quantity);
		stockManager.addItem(name, quantity);
	}

	public int getStockLevel(String name) {
		validateName(name);
		return stockManager.getStockLevel(name);
	}

	private void validateName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Ingredient name cannot be null or empty.");
		}
	}

	private void validatePositiveQuantity(int quantity) {
		if (quantity <= 0) {
			throw new IllegalArgumentException("Quantity must be greater than zero.");
		}
	}

	public void setThreshold(String name, int threshold) {
		validateName(name);
		if (threshold <= 0) {
			throw new IllegalArgumentException("Threshold must be greater than zero.");
		}
		
		stockManager.setThreshold(name, threshold);

	}
	public int getThreshold(String Threshold) {
		// TODO Auto-generated method stub
		return stockManager.getThreshold(Threshold);
	}

	public String suggestRestocking(String name) {
		validateName(name);
		int stockLevel = stockManager.getStockLevel(name);
		int threshold = stockManager.getThreshold(name);
		if (stockLevel < threshold) {
			return "Suggest restocking " +name;
		} else {
			return "No restocking needed for " + name;
		}
	}

}
