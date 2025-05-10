package mainpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySystem {
    private Map<String, Ingredient> ingredients;
    private Map<String, Integer> thresholds;
    private List<Order> orders = new ArrayList<>();
    private boolean isMonitoring;
    private boolean customerLoggedIn = false;

    public MySystem() {
        ingredients = new HashMap<>();
        thresholds = new HashMap<>();
        isMonitoring = false;
    }

    // Method to add an ingredient to the system
    public void addIngredient(Ingredient ingredient) {
        ingredients.put(ingredient.getName(), ingredient);
    }

    // Method to get the stock level of an ingredient
    public int getStockLevel(String ingredientName) {
        if (ingredients.containsKey(ingredientName)) {
            return ingredients.get(ingredientName).getStock();
        }
        return 0; // Return 0 if the ingredient is not found
    }

    // Method to use an ingredient (decrease stock)
    public void useIngredient(String ingredientName, int amount) {
        if (ingredients.containsKey(ingredientName)) {
            Ingredient ingredient = ingredients.get(ingredientName);
            ingredient.setStock(ingredient.getStock() - amount);
        }
    }

    // Method to add quantity to an ingredient (restocking)
    public void addIngredientQuantity(String ingredientName, int amount) {
        if (ingredients.containsKey(ingredientName)) {
            Ingredient ingredient = ingredients.get(ingredientName);
            ingredient.setStock(ingredient.getStock() + amount);
        }
    }

    // Method to set a threshold for an ingredient
    public void setThreshold(String ingredientName, int threshold) {
        thresholds.put(ingredientName, threshold);
    }

    // Method to get the threshold for an ingredient
    public int getThreshold(String ingredientName) {
        return thresholds.getOrDefault(ingredientName, Integer.MAX_VALUE); // Default to a very high threshold
    }

    // Method to check if the stock level of an ingredient is below the threshold
    public boolean isBelowThreshold(String ingredientName) {
        int currentStock = getStockLevel(ingredientName);
        int threshold = getThreshold(ingredientName);
        return currentStock < threshold;
    }

    // Method to suggest restocking if the ingredient's stock is below the threshold
    public String suggestRestocking(String ingredientName) {
        if (isBelowThreshold(ingredientName)) {
            return "Suggest restocking " + ingredientName;
        }
        return "Stock is sufficient for " + ingredientName;
    }

    // Method to start monitoring the stock levels
    public void startMonitoringStockLevels() {
        isMonitoring = true;
    }

    // Method to check if the system is monitoring the stock levels
    public boolean isMonitoringStockLevels() {
        return isMonitoring;
    }

    // Method to simulate the kitchen manager's login
    public boolean managerIsLoggedIn() {
        // Assume the manager is logged in for simplicity
        return true;
    }

	public void loginCustomer(String username, String password) {
		
		if (username.equals("customer1") && password.equals("password123")) {
	        customerLoggedIn = true;
	    } else {
	        customerLoggedIn = false;
	    }
		
	}
	public boolean customerisLoggedIn() {
	    return customerLoggedIn;
	}

	public void placeOrder(Order order) {
		// Simulate placing an order
//	    System.out.println("Order placed for customer: " + order.getCustomerName());
//	    for (String item : order.getItems()) {
//	        System.out.println("Item: " + item);
//	    }
	    order.completeOrder();
		
	}

	public boolean isOrderCompleted(Order order) {

		// Simulate checking if the order is completed
	    return order.isCompleted();
	}


}
