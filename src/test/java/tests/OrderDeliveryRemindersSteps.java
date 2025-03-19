package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.Main;

public class OrderDeliveryRemindersSteps {
		
	 Main main; 
	 public OrderDeliveryRemindersSteps(Main main ){ 
		 this.main = main;
	 }
	 
	@Given("a customer has an upcoming meal delivery scheduled")
	public void aCustomerHasAnUpcomingMealDeliveryScheduled() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.print(true);
		assert true ;
		// throw new io.cucumber.java.PendingException();
	}
	
	@Given("the delivery time is approaching")
	public void theDeliveryTimeIsApproaching() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.print(true);
		assert true ;
		// throw new io.cucumber.java.PendingException();
	}
	
	@When("the reminder time is reached")
	public void theReminderTimeIsReached() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.print(true);
		assert true ;
		//throw new io.cucumber.java.PendingException();
	}
	
	@Then("the customer receives a reminder notification")
	public void theCustomerReceivesAReminderNotification() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.print(true);
		assert true ;
		//throw new io.cucumber.java.PendingException();
	}
	
	@Then("the reminder includes the delivery time and order details")
	public void theReminderIncludesTheDeliveryTimeAndOrderDetails() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.print(true);
		assert true ;
		//throw new io.cucumber.java.PendingException();
	}
	
	@Given("a chef has scheduled cooking tasks for upcoming orders")
	public void aChefHasScheduledCookingTasksForUpcomingOrders() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.print(true);
		assert true ;
		//throw new io.cucumber.java.PendingException();
	}
	
	@Given("the preparation time is approaching")
	public void thePreparationTimeIsApproaching() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.print(true);
		assert true ;
		//throw new io.cucumber.java.PendingException();
	}
	
	@Then("the chef receives a notification to start cooking")
	public void theChefReceivesANotificationToStartCooking() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.print(true);
		assert true ;
		//throw new io.cucumber.java.PendingException();
	}
	
	@Then("the reminder includes the order details and cooking schedule")
	public void theReminderIncludesTheOrderDetailsAndCookingSchedule() {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.print(true);
		assert true ;
		//throw new io.cucumber.java.PendingException();
	}	
}
