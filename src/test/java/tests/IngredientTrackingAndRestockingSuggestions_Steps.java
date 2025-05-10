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
//		mySystem.loginKitchenManager();
//		assertTrue("Kitchen manager should be logged in", mySystem.kitchenManagerIsLoggedIn());
	}

	@When("ingredients are used or added")
	public void ingredientsAreUsedOrAdded() {
//		mySystem.addIngredient("Tomato", 50, 10);
//		mySystem.useIngredient("Tomato", 20);
//		mySystem.addIngredientQuantity("Tomato", 10);
//		int currentStock = mySystem.getStockLevel("Tomato");
//		assertEquals("Stock level should reflect usage and restocking", 40, currentStock);
	}

	@Then("the system updates the stock levels in real time")
	public void theSystemUpdatesTheStockLevelsInRealTime() {
//		int currentStock = mySystem.getStockLevel("Tomato");
//		assertEquals("Stock level should be updated in real time", 40, currentStock);
	}

	@Given("the system is monitoring ingredient stock levels")
	public void theSystemIsMonitoringIngredientStockLevels() {
	//	mySystem.startMonitoringStockLevels();
	//	assertTrue("System should be monitoring stock levels", mySystem.isMonitoringStockLevels());
	}

	@When("an ingredient falls below the predefined threshold")
	public void anIngredientFallsBelowThePredefinedThreshold() {
	//	mySystem.setThreshold("Tomato", 30);
	//	mySystem.addIngredient("Tomato", 40, 30);
	//	mySystem.useIngredient("Tomato", 15);
	//	int currentStock = mySystem.getStockLevel("Tomato");
	//	assertTrue("Stock level should be below the threshold", currentStock < 30);
	}

	@Then("the system suggests restocking the ingredient to the kitchen manager")
	public void theSystemSuggestsRestockingTheIngredientToTheKitchenManager() {
	//	int currentStock = mySystem.getStockLevel("Tomato");
	//	int threshold = mySystem.getThreshold("Tomato");
	//	if (currentStock < threshold) {
	//		String suggestion = mySystem.suggestRestocking("Tomato");
	//		assertNotNull("The system should suggest restocking the ingredient", suggestion);
	//		assertEquals("Restock suggestion should mention Tomato", "Suggest restocking Tomato", suggestion);
	//	} else {
	//		fail("Stock level is not below the threshold, no restocking suggestion should be made");
	//	}
	}
}