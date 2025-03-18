package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NotifyUsersAboutInventory_Steps {

    @Given("the current stock levels are being monitored")
    public void theCurrentStockLevelsAreBeingMonitored() {
        System.out.println("Stock levels are now being monitored.");
    }

    @Given("Stock levels are lower than required")
    public void stockLevelsAreLowerThanRequired() {
        System.out.println("Stock levels are lower than the required amount.");
    }

    @When("the system detects the low-stock level")
    public void theSystemDetectsTheLowStockLevel() {
        System.out.println("System detected low-stock levels.");
    }

    @Then("an alert is sent to the kitchen manager")
    public void anAlertIsSentToTheKitchenManager() {
        System.out.println("Alert: Kitchen manager has been notified.");
    }

    @Then("I will adjust and fill the inventory again")
    public void iWillAdjustAndFillTheInventoryAgain() {
        System.out.println("Inventory is being restocked.");
    }
}

