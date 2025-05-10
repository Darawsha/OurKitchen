package tests;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.*;

public class NotifyUsersAboutInventory_Steps {

	MySystem MySystem;

	public NotifyUsersAboutInventory_Steps(MySystem MySystem) {

		this.MySystem = MySystem;

	}

	@Given("the current stock levels are being monitored")
	public void theCurrentStockLevelsAreBeingMonitored() {

		MySystem.startMonitoringStockLevels();
		assertTrue("System should be monitoring stock levels", MySystem.isMonitoringStockLevels());

	}

	@Given("Stock levels are lower than required")
	public void stockLevelsAreLowerThanRequired() {
		Ingredient ingredient = new Ingredient("Tomato", 50, 30);
		MySystem.addIngredient(ingredient);
		MySystem.useIngredient("Tomato", 25);

		int currentStock = MySystem.getStockLevel("Tomato");
		assertTrue("Stock level should be below the threshold", currentStock < ingredient.getThreshold());
	}

	@When("the system detects the low-stock level")
	public void theSystemDetectsTheLowStockLevel() {

	}

	@Then("an alert is sent to the kitchen manager")
	public void anAlertIsSentToTheKitchenManager() {

	}

	@Then("I will adjust and fill the inventory again")
	public void iWillAdjustAndFillTheInventoryAgain() {

	}
}
