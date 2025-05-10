package tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.*;
public class IngredientTrackingAndRestockingSuggestions_Steps {
	MySystem MySystem;
	public IngredientTrackingAndRestockingSuggestions_Steps(MySystem MySystem) {
		this.MySystem = MySystem;
	}

	@Given("the kitchen manager is logged into the system")
	public void theKitchenManagerIsLoggedIntoTheSystem() {
		assertTrue("Kitchen manager should be logged in", MySystem.managerIsLoggedIn());
	}

	@When("ingredients are used or added")
	public void ingredientsAreUsedOrAdded() {
		Ingredient ingredient = new Ingredient("Tomato", 50, 10);
		MySystem.addIngredient(ingredient);
		MySystem.useIngredient("Tomato", 20);
		MySystem.addIngredientQuantity("Tomato", 10);
		int currentStock = MySystem.getStockLevel("Tomato");
		assertEquals("Stock level should reflect usage and restocking", 40, currentStock);
	}

	@Then("the system updates the stock levels in real time")
	public void theSystemUpdatesTheStockLevelsInRealTime() {
		int currentStock = MySystem.getStockLevel("Tomato");
		assertEquals("Stock level should be updated in real time", 40, currentStock);
	}

	@Given("the system is monitoring ingredient stock levels")
	public void theSystemIsMonitoringIngredientStockLevels() {
		MySystem.startMonitoringStockLevels();
		assertTrue("System should be monitoring stock levels", MySystem.isMonitoringStockLevels());
	}

	@When("an ingredient falls below the predefined threshold")
	public void anIngredientFallsBelowThePredefinedThreshold() {
		MySystem.setThreshold("Tomato", 30);
		MySystem.addIngredient(new Ingredient("Tomato", 40, 30));
		MySystem.useIngredient("Tomato", 15);
		int currentStock = MySystem.getStockLevel("Tomato");
		assertTrue("Stock level should be below the threshold", currentStock < 30);
	}

	@Then("the system suggests restocking the ingredient to the kitchen manager")
	public void theSystemSuggestsRestockingTheIngredientToTheKitchenManager() {
		int currentStock = MySystem.getStockLevel("Tomato");
		int threshold = MySystem.getThreshold("Tomato");
		if (currentStock < threshold) {
			String suggestion = MySystem.suggestRestocking("Tomato");
			assertNotNull("The system should suggest restocking the ingredient", suggestion);
			assertEquals("Restock suggestion should mention Tomato", "Suggest restocking Tomato", suggestion);
		} else {
			fail("Stock level is not below the threshold, no restocking suggestion should be made");
		}
	}
}
