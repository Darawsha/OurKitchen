package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.Main;

public class BillingSystem_Steps {
	
	/*
	 * Main main ; BillingSystem_Steps(Main main){
	 * 
	 * this.main=main;
	 * 
	 * }
	 */
	@Given("the customer has logged in successfully")
	public void theCustomerHasLoggedInSuccessfully() {
	    // Write code here that turns the phrase above into concrete actions
	    assert true ;
		//throw new io.cucumber.java.PendingException();
	}

	@Given("the customer has successfully completed their order")
	public void theCustomerHasSuccessfullyCompletedTheirOrder() {
		// Write code here that turns the phrase above into concrete actions
	    assert true ;
		//throw new io.cucumber.java.PendingException();
	}

	@Given("the order has been successfully processed")
	public void theOrderHasBeenSuccessfullyProcessed() {
		// Write code here that turns the phrase above into concrete actions
	    assert true ;
		//throw new io.cucumber.java.PendingException();
	}

	@When("the system creates the bill")
	public void theSystemCreatesTheBill() {
		// Write code here that turns the phrase above into concrete actions
	    assert true ;
		//throw new io.cucumber.java.PendingException();
	}

	@Then("the bill should contain the customer's name {string}, order number {string}, date of order {string}, cost {string}, order details {string}, and payment method {string}")
	public void theBillShouldContainTheCustomerSNameOrderNumberDateOfOrderCostOrderDetailsAndPaymentMethod(String string, String string2, String string3, String string4, String string5, String string6) {
		// Write code here that turns the phrase above into concrete actions
	    assert true ;
		//throw new io.cucumber.java.PendingException();
	}

	@Then("the bill should be sent to the customer's email {string}")
	public void theBillShouldBeSentToTheCustomerSEmail(String string) {
		// Write code here that turns the phrase above into concrete actions
	    assert true ;
		//throw new io.cucumber.java.PendingException();
	}

	@Then("the bill should be added to the customer's account order history")
	public void theBillShouldBeAddedToTheCustomerSAccountOrderHistory() {
		// Write code here that turns the phrase above into concrete actions
	    assert true ;
		//throw new io.cucumber.java.PendingException();
	}

	@Given("the admin is logged into the system")
	public void theAdminIsLoggedIntoTheSystem() {
		// Write code here that turns the phrase above into concrete actions
	    assert true ;
		//throw new io.cucumber.java.PendingException();
	}

	@Given("the admin has selected the {string} option")
	public void theAdminHasSelectedTheOption(String string) {
		// Write code here that turns the phrase above into concrete actions
	    assert true ;
		//throw new io.cucumber.java.PendingException();
	}

	@When("the admin selects a date range from {string} to {string}")
	public void theAdminSelectsADateRangeFromTo(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
	    assert true ;
		//throw new io.cucumber.java.PendingException();
	}

	@Then("the system should generate the Financial Report for the selected date range")
	public void theSystemShouldGenerateTheFinancialReportForTheSelectedDateRange() {
		// Write code here that turns the phrase above into concrete actions
	    assert true ;
		//throw new io.cucumber.java.PendingException();
	}

	@Then("the system should send the Financial Report to the admin via email")
	public void theSystemShouldSendTheFinancialReportToTheAdminViaEmail() {
		// Write code here that turns the phrase above into concrete actions
	    assert true ;
		//throw new io.cucumber.java.PendingException();
	}

	@Then("the admin should be able to save the Financial Report as a PDF")
	public void theAdminShouldBeAbleToSaveTheFinancialReportAsAPDF() {
		// Write code here that turns the phrase above into concrete actions
	    assert true ;
		//throw new io.cucumber.java.PendingException();
	}
}
