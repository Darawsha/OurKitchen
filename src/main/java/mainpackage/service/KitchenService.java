package mainpackage.service;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Map;
import java.util.Objects;

import mainpackage.*;
import mainpackage.model.*;

public class KitchenService {

	private final Map<String, KitchenManager> kitchenManagers = new ConcurrentHashMap<>();
	private KitchenManager currentKitchenManager;
	private final SupplierManager supplierManager;
	private final StockManager stockManager;
	private volatile boolean isMonitoringStockLevels;
	private final ReentrantLock lock = new ReentrantLock();

	public KitchenService(SupplierManager supplierManager, StockManager stockManager) {
		this.supplierManager = Objects.requireNonNull(supplierManager, "SupplierManager cannot be null.");
		this.stockManager = Objects.requireNonNull(stockManager, "StockManager cannot be null.");
	}

	public void createKitchenManager(String username, String password) {
		if (kitchenManagers.containsKey(username)) {
			throw new IllegalArgumentException("Kitchen manager with username '" + username + "' already exists.");
		}
		kitchenManagers.put(username, new KitchenManager(username, password, true));
	}

	public void loginKitchenManager(String userName, String password) {
		lock.lock();
		try {
			KitchenManager km = kitchenManagers.get(userName);
			if (km != null && km.getPassword().equals(password)) {
				km.setLoggedIn(true);
				currentKitchenManager = km;
			} else {
				throw new IllegalArgumentException("Invalid username or password for kitchen manager.");
			}
		} finally {
			lock.unlock();
		}
	}

	public boolean kitchenManagerIsLoggedIn(String userName) {
		KitchenManager km = kitchenManagers.get(userName);
		return km != null && km.isLoggedIn();
	}

	public String getIngredientPrices(String ingredientName) {
		return supplierManager.getRealTimePrice(ingredientName);
	}

	public boolean generateAndSendPurchaseOrder(String itemName, int quantity) {
		PurchaseOrder order = new PurchaseOrder(itemName, quantity, new Date());
		return supplierManager.sendOrder(order);
	}

	public boolean connectToSupplierAPI() {
		if (supplierManager.connect())
			System.out.println("Connected to supplier API");
		return true;

	}

	public void startMonitoringStockLevels() {
		stockManager.startMonitoring();
		isMonitoringStockLevels = true;
	}

	public boolean isMonitoringStockLevels() {
		return isMonitoringStockLevels;
	}
}
