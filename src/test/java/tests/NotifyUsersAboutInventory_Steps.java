package tests;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.*;

public class NotifyUsersAboutInventory_Steps {

	private MySystem mySystem;

	public NotifyUsersAboutInventory_Steps(MySystem mySystem) {
		this.mySystem = mySystem;
	}

	@Given("the current stock levels are being monitored")
	public void theCurrentStockLevelsAreBeingMonitored() {
		mySystem.startMonitoringStockLevels();
		assertTrue("System should be monitoring stock levels", mySystem.isMonitoringStockLevels());
	}

	@Given("Stock levels are lower than required")
	public void stockLevelsAreLowerThanRequired() {
	//	mySystem.addIngredient("Tomato", 50, 30);
	//	mySystem.useIngredient("Tomato", 25);
	//	int currentStock = mySystem.getStockLevel("Tomato");
	//	assertTrue("Stock level should be below the threshold", currentStock < 30);
	}

	@When("the system detects the low-stock level")
	public void theSystemDetectsTheLowStockLevel() {
	//	mySystem.checkStockLevels();
	//	assertTrue("System should detect low stock levels", mySystem.isLowStockDetected("Tomato"));
	}

	@Then("an alert is sent to the kitchen manager")
	public void anAlertIsSentToTheKitchenManager() {
	//	mySystem.sendLowStockAlert("Tomato");
	//	assertTrue("Alert should be sent to the kitchen manager", mySystem.isAlertSent("Tomato"));
	}

	@Then("I will adjust and fill the inventory again")
	public void iWillAdjustAndFillTheInventoryAgain() {
	//	boolean stockUpdated = mySystem.restockIngredient("Tomato", 100);
	//	assertTrue("The inventory for Tomato should be refilled", stockUpdated);
	}
}