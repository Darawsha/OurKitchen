package tests;

import static org.junit.Assert.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.*;

public class BillingSystem_Steps {

	MySystem MySystem;
	

	public BillingSystem_Steps(MySystem MySystem) {

		this.MySystem = MySystem;

	}

	@Given("the customer has logged in successfully")
	public void theCustomerHasLoggedInSuccessfully() {
		 MySystem.loginCustomer("customer1", "password123");
		assertTrue("Customer should be logged in the system", MySystem.customerisLoggedIn());
	}

	@Given("the customer has successfully completed their order")
	public void theCustomerHasSuccessfullyCompletedTheirOrder() {
	    MySystem.loginCustomer("customer1", "password123");

	    Order order = new Order("customer1");
	    order.addItem("Pizza", 2);
	    order.addItem("Salad", 1);

	    MySystem.placeOrder(order);

	    assertTrue("Customer's order should be marked as completed", MySystem.isOrderCompleted(order));
	}

	@Given("the order has been successfully processed")
	public void theOrderHasBeenSuccessfullyProcessed() {

	}

	@When("the system creates the bill")
	public void theSystemCreatesTheBill() {
	
	}

	@Then("the bill should contain the customer's name {string}, order number {string}, date of order {string}, cost {string}, order details {string}, and payment method {string}")
	public void theBillShouldContainTheCustomerSNameOrderNumberDateOfOrderCostOrderDetailsAndPaymentMethod(
			String string, String string2, String string3, String string4, String string5, String string6) {
	
	}

	@Then("the bill should be sent to the customer's email {string}")
	public void theBillShouldBeSentToTheCustomerSEmail(String string) {

	}

	@Then("the bill should be added to the customer's account order history")
	public void theBillShouldBeAddedToTheCustomerSAccountOrderHistory() {

	}

	@Given("the admin is logged into the system")
	public void theAdminIsLoggedIntoTheSystem() {

	}

	@Given("the admin has selected the {string} option")
	public void theAdminHasSelectedTheOption(String string) {

	}

	@When("the admin selects a date range from {string} to {string}")
	public void theAdminSelectsADateRangeFromTo(String string, String string2) {

	}

	@Then("the system should generate the Financial Report for the selected date range")
	public void theSystemShouldGenerateTheFinancialReportForTheSelectedDateRange() {

	}

	@Then("the system should send the Financial Report to the admin via email")
	public void theSystemShouldSendTheFinancialReportToTheAdminViaEmail() {

	}

	@Then("the admin should be able to save the Financial Report as a PDF")
	public void theAdminShouldBeAbleToSaveTheFinancialReportAsAPDF() {

	}
}
