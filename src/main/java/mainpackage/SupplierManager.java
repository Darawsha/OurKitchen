package mainpackage;

import java.util.HashMap;
import java.util.Map;

public class SupplierManager {

	private Map<String, Double> ingredientPrices;

	public SupplierManager() {

		ingredientPrices = new HashMap<>();
		ingredientPrices.put("Tomato", 1.25);
		ingredientPrices.put("Cheese", 2.50);
		ingredientPrices.put("Lettuce", 0.80);
	}

	public String getRealTimePrice(String ingredientName) {
		if (ingredientPrices.containsKey(ingredientName)) {
			return ingredientName + " price: $" + ingredientPrices.get(ingredientName);
		} else {
			return ingredientName + " not available";
		}
	}

	public boolean sendOrder(PurchaseOrder order) {
		System.out.println("Sending order to supplier: " + order.getItemName() + ", Quantity: " + order.getQuantity());

		return true;

	}

	public boolean connect() {

		return true;

	}

}
