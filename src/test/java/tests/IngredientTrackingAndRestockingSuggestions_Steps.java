package tests;

import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.*;

public class IngredientTrackingAndRestockingSuggestions_Steps {

	private MySystem mySystem;

	public IngredientTrackingAndRestockingSuggestions_Steps(MySystem mySystem) {
		this.mySystem = mySystem;
	}

	@Given("the kitchen manager is logged into the system")
	public void theKitchenManagerIsLoggedIntoTheSystem() {
		mySystem.getKitchenService().createKitchenManager("manager", "password");
		mySystem.getKitchenService().loginKitchenManager("manager", "password");
		assertTrue("Kitchen manager should be logged in",
				mySystem.getKitchenService().kitchenManagerIsLoggedIn("manager"));
	}

	@When("ingredients are used or added")
	public void ingredientsAreUsedOrAdded() {
		mySystem.getStorehouseService().addIngredient("Tomato", 50, 10);
		mySystem.getStorehouseService().useIngredient("Tomato", 20);
		mySystem.getStorehouseService().addIngredientQuantity("Tomato", 10);
		int currentStock = mySystem.getStorehouseService().getStockLevel("Tomato");
		assertEquals("Stock level should reflect usage and restocking", 40, currentStock);
	}

	@Then("the system updates the stock levels in real time")
	public void theSystemUpdatesTheStockLevelsInRealTime() {
		int currentStock = mySystem.getStorehouseService().getStockLevel("Tomato");
		assertEquals("Stock level should be updated in real time", 40, currentStock);
	}

	@Given("the system is monitoring ingredient stock levels")
	public void theSystemIsMonitoringIngredientStockLevels() {
		mySystem.getKitchenService().startMonitoringStockLevels();
		assertTrue("System should be monitoring stock levels", mySystem.getKitchenService().isMonitoringStockLevels());
	}

	@When("an ingredient falls below the predefined threshold")
	public void anIngredientFallsBelowThePredefinedThreshold() {
		mySystem.getStorehouseService().setThreshold("Tomato", 30);
		mySystem.getStorehouseService().addIngredient("Tomato", 40, 30);
		mySystem.getStorehouseService().useIngredient("Tomato", 15);
		int currentStock = mySystem.getStorehouseService().getStockLevel("Tomato");
		assertTrue("Stock level should be below the threshold", currentStock < 30);
	}

	@Then("the system suggests restocking the ingredient to the kitchen manager")
	public void theSystemSuggestsRestockingTheIngredientToTheKitchenManager() {

		mySystem.getStorehouseService().addIngredient("Tomato", 40, 100);
		mySystem.getStorehouseService().useIngredient("Tomato", 15);

		int currentStock = mySystem.getStorehouseService().getStockLevel("Tomato"); 
		int threshold = mySystem.getStorehouseService().getThreshold("Tomato");

		if (currentStock < threshold) {
			String suggestion = mySystem.getStorehouseService().suggestRestocking("Tomato");
			assertNotNull("The system should suggest restocking the ingredient", suggestion);
			assertEquals("Restock suggestion should mention Tomato", "Suggest restocking Tomato", suggestion);
		} else {
			fail("Stock level is not below the threshold, no restocking suggestion should be made");
		}
	}

}