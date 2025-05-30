package mainpackage.service;

import mainpackage.StockManager;

public class StockService {

    private StockManager stockManager;

    // Constructor to initialize StockManager
    public StockService(StockManager stockManager) {
        this.stockManager = stockManager;
    }

    public void checkStockLevels() {
        stockManager.checkStockLevels();
    }

    public boolean isLowStockDetected(String itemName, int quantity) {
        return stockManager.StockDetected(itemName, quantity);
    }

    public void setStockLevel(String itemName, int quantity) {
        stockManager.addItem(itemName, quantity);
    }
    public int getStockLevel(String itemName) {
		return stockManager.getStockLevel(itemName);
	}
}
