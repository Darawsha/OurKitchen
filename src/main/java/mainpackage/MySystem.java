package mainpackage;

import java.text.*;
import java.util.*;

import mainpackage.model.Customer;
import mainpackage.model.KitchenManager;

public class MySystem {

	private Map<String, Customer> customers = new HashMap<>();
	private Customer currentCustomer;
	private StockManager stockManager = new StockManager();

	private Map<String, KitchenManager> kitchenManagers = new HashMap<>();
	private KitchenManager currentKitchenManager;
	private SupplierManager supplierManager = new SupplierManager();

	private boolean isMonitoringStockLevels = false;
	
	// CUSTOMER METHODS

	public void loginCustomer(String userName, String password) {
		Customer customer = customers.get(userName);
		if (customer != null && customer.getPassword().equals(password)) {
			customer.setLoggedIn(true);
			currentCustomer = customer;
		} else {
			throw new IllegalArgumentException("Invalid username or password");
		}
	}

	public boolean customerIsLoggedIn(String userName) {
		Customer customer = customers.get(userName);
		if (customer != null) {
			return customer.isLoggedIn();
		} else {
			throw new IllegalArgumentException("Customer not found");
		}
	}

	public void registerCustomer(String username, String password) {
		if (customers.containsKey(username)) {
		//	throw new IllegalArgumentException("Username already exists");
		}
		customers.put(username, new Customer(username, password,true));
	}

	public void createOrder(String orderName, String isoDateStr) {
		if (currentCustomer == null) {
		//	throw new IllegalStateException("No customer logged in");
		}
		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Date date = df.parse(isoDateStr);
			Order order = new Order(orderName, date);
			currentCustomer.setCurrentOrder(order);
		} catch (ParseException e) {
		//	throw new IllegalArgumentException("Invalid date format. Use ISO format: yyyy-MM-dd'T'HH:mm:ss");
		}
	}

	public void addOrderItem(String itemName, int quantity) {
		if (currentCustomer == null) {
		//	throw new IllegalStateException("No customer logged in");
		}
		Order order = currentCustomer.getCurrentOrder();
		if (order == null) {
		//	throw new IllegalStateException("No current order");
		}
		order.addItem(itemName, quantity);
	}

	public void completeOrder() {
		if (currentCustomer == null) {
		//	throw new IllegalStateException("No customer logged in");
		}
		Order order = currentCustomer.getCurrentOrder();
		if (order == null) {
	//		throw new IllegalStateException("No current order to complete");
		}
		order.completeOrder();
		currentCustomer.addOrderToHistory(order);
		currentCustomer.setCurrentOrder(null);
	}

	public boolean isOrderCompleted() {
		if (currentCustomer == null) {
	//		throw new IllegalStateException("No customer logged in");
		}
		List<Order> history = currentCustomer.getOrderHistory();
		return !history.isEmpty() && history.get(history.size() - 1).isCompleted();
	}

	// STOCK METHODS

	public void checkStockLevels() {
		stockManager.checkStockLevels();
	}

	public boolean isLowStockDetected(String itemName, int quantity) {
		return stockManager.StockDetected(itemName, quantity);
	}

	public void setStockLevel(String itemName, int quantity) {
		stockManager.addItem(itemName, quantity);
	}

	// KITCHEN MANAGER METHODS

	public void createKitchenManager(String username, String password) {
		if (kitchenManagers.containsKey(username)) {
//			throw new IllegalArgumentException("Kitchen manager already exists");
		}
		kitchenManagers.put(username, new KitchenManager(username, password,true));
	}

	public void loginKitchenManager(String userName, String password) {
		KitchenManager km = kitchenManagers.get(userName);
		if (km != null && km.getPassword().equals(password)) {
			km.setLoggedIn(true);
			currentKitchenManager = km;
		} else {
//			throw new IllegalArgumentException("Invalid username or password");
		}
	}

	public boolean kitchenManagerIsLoggedIn(String userName) {
		KitchenManager km = kitchenManagers.get(userName);
		return km != null && km.isLoggedIn();
	}

	public String getIngredientPrices(String ingredientName) {
		return supplierManager.getRealTimePrice(ingredientName);
	}

	public int getStockLevel(String itemName) {
		return stockManager.getStockLevel(itemName);
	}

	public boolean generateAndSendPurchaseOrder(String itemName, int quantity) {
		PurchaseOrder order = new PurchaseOrder(itemName, quantity, new Date());
		return supplierManager.sendOrder(order);
	}

	public boolean connectToSupplierAPI() {
		if (supplierManager.connect()) {
			System.out.println("Connected to supplier API");
			return true;
		} else {
			System.out.println("Failed to connect to supplier API");
			return false;
		}
	}

	public void startMonitoringStockLevels() {	
		stockManager.startMonitoring();
		isMonitoringStockLevels = true;
		
	}

	public boolean isMonitoringStockLevels() {
		// TODO Auto-generated method stub
		return isMonitoringStockLevels;
	}
}
