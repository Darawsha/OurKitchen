package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import mainpackage.*;
public class IngredientTrackingAndRestockingSuggestions_Steps {
	
		Manager manager = new Manager ();
	
	Main main; 
	public IngredientTrackingAndRestockingSuggestions_Steps(Main main){
		this.main=main;
	}
	
	@Given("the kitchen manager is logged into the system")
	public void theKitchenManagerIsLoggedIntoTheSystem() {
	    // Write code here that turns the phrase above into concrete actions
		assert true;
		//throw new io.cucumber.java.PendingException();
	    
	}

	@When("ingredients are used or added")
	public void ingredientsAreUsedOrAdded() {
	    // Write code here that turns the phrase above into concrete actions
		// Write code here that turns the phrase above into concrete actions
		assert true;
		//throw new io.cucumber.java.PendingException();
	}

	@Then("the system updates the stock levels in real time")
	public void theSystemUpdatesTheStockLevelsInRealTime() {
	    // Write code here that turns the phrase above into concrete actions
		// Write code here that turns the phrase above into concrete actions
		assert true;
		//throw new io.cucumber.java.PendingException();
	}

	@Given("the system is monitoring ingredient stock levels")
	public void theSystemIsMonitoringIngredientStockLevels() {
	    // Write code here that turns the phrase above into concrete actions
		// Write code here that turns the phrase above into concrete actions
		assert true;
		//throw new io.cucumber.java.PendingException();
	}

	@When("an ingredient falls below the predefined threshold")
	public void anIngredientFallsBelowThePredefinedThreshold() {
	    // Write code here that turns the phrase above into concrete actions
		// Write code here that turns the phrase above into concrete actions
		assert true;
		//throw new io.cucumber.java.PendingException();
	}

	@Then("the system suggests restocking the ingredient to the kitchen manager")
	public void theSystemSuggestsRestockingTheIngredientToTheKitchenManager() {
	    // Write code here that turns the phrase above into concrete actions
		// Write code here that turns the phrase above into concrete actions
		assert true;
		//throw new io.cucumber.java.PendingException();
	}
	
}
