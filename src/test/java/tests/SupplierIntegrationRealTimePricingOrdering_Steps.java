package tests;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.*;

public class SupplierIntegrationRealTimePricingOrdering_Steps {

	private MySystem mySystem;

	public SupplierIntegrationRealTimePricingOrdering_Steps(MySystem mySystem) {
		this.mySystem = mySystem;
	}

	@Given("the kitchen manager wants to check ingredient prices")
	public void theKitchenManagerWantsToCheckIngredientPrices() {
		mySystem.getKitchenService().createKitchenManager("KitchenManager", "password");
		mySystem.getKitchenService().loginKitchenManager("KitchenManager", "password");
		// mySystem.loginKitchenManager("KitchenManager2", "wrongpassword");
		assertTrue("Kitchen manager should be logged in", mySystem.getKitchenService().kitchenManagerIsLoggedIn("KitchenManager"));
		// assertFalse("Kitchen manager should have a account",
		// mySystem.kitchenManagerIsLoggedIn("KitchenManager2"));
	}

	@When("the system connects to supplier APIs")
	public void theSystemConnectsToSupplierAPIs() {
		 boolean connected = mySystem.getKitchenService().connectToSupplierAPI();
		 assertTrue("System should connect to supplier APIs", connected);
	}

	@Then("the system displays real-time prices for the ingredients")
	public void theSystemDisplaysRealTimePricesForTheIngredients() {
		String prices = mySystem.getKitchenService().getIngredientPrices("Tomato");
		assertNotNull("Real-time prices should be displayed", prices);
		assertTrue("Prices should include Tomato", prices.contains("Tomato"));
	}

	@Given("an ingredient's stock level is critically low")
	public void anIngredientSStockLevelIsCriticallyLow() {
		mySystem.getStockService().setStockLevel("Tomato", 5);
		int currentStock = mySystem.getStockService().getStockLevel("Tomato");
		assertTrue("Stock level should be below threshold", currentStock < 30);
	}

	@When("the system detects the low stock level")
	public void theSystemDetectsTheLowStockLevel() {
		mySystem.getStockService().setStockLevel("Tomato", 10);
		mySystem.getStockService().checkStockLevels();
		assertTrue("System detect low stock levels", mySystem.getStockService().isLowStockDetected("Tomato", 10));
	}

	@Then("the system generates a purchase order and sends it to the supplier")
	public void theSystemGeneratesAPurchaseOrderAndSendsItToTheSupplier() {
		boolean orderSent = mySystem.getKitchenService().generateAndSendPurchaseOrder("Tomato", 100);
		assertTrue("Purchase order should be generated and sent", orderSent);
	}
}