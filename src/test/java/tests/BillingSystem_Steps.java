package tests;

import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.*;

public class BillingSystem_Steps {

	private MySystem mySystem;

	public BillingSystem_Steps(MySystem mySystem) {
		this.mySystem = mySystem;
	}

	@Given("the customer has logged in successfully")
	public void theCustomerHasLoggedInSuccessfully() {

		mySystem.getCustomerService().registerCustomer("customer1", "password123");
		mySystem.getCustomerService().loginCustomer("customer1", "password123");
		assertTrue("Customer should be logged in the system", mySystem.getCustomerService().customerIsLoggedIn("customer1"));
	}

	@Given("the customer has successfully completed their order")
	public void theCustomerHasSuccessfullyCompletedTheirOrder() {
		mySystem.getCustomerService().loginCustomer("customer1", "password123");
		mySystem.getCustomerService().createOrder("Pizza Order", "2025-05-11T12:00:00");
		mySystem.getCustomerService().addOrderItem("Pizza", 2);
		mySystem.getCustomerService().addOrderItem("Salad", 1);
		mySystem.getCustomerService().completeOrder();
		assertTrue("Customer's order should be marked as completed", mySystem.getCustomerService().isOrderCompleted());
	}

	@Given("the order has been successfully processed")
	public void theOrderHasBeenSuccessfullyProcessed() {
//		mySystem.loginCustomer("customer1", "password123");
//		mySystem.createOrder("Pizza Order", "2025-05-11T12:00:00");
//		mySystem.addOrderItem("Pizza", 2);
//		mySystem.addOrderItem("Salad", 1);
//		mySystem.completeOrder();
//		assertTrue("Order should be processed", mySystem.isOrderCompleted());
	}

	@When("the system creates the bill")
	public void theSystemCreatesTheBill() {
//		mySystem.createBill("Credit Card");
//		mySystem.generateBill();
//		assertNotNull("Bill should be created", mySystem.getBillDetails());
	}

	@Then("the bill should contain the customer's name {string}, order number {string}, date of order {string}, cost {string}, order details {string}, and payment method {string}")
	public void theBillShouldContainTheCustomerSNameOrderNumberDateOfOrderCostOrderDetailsAndPaymentMethod(
			String customerName, String orderNumber, String orderDate, String cost, String orderDetails,
			String paymentMethod) {
//		String billDetails = mySystem.getBillDetails();
//		assertTrue("Bill should contain customer name", billDetails.contains(customerName));
//		assertTrue("Bill should contain order number", billDetails.contains(orderNumber));
//		assertTrue("Bill should contain order date", billDetails.contains(orderDate));
//		assertTrue("Bill should contain cost", billDetails.contains(cost));
//		assertTrue("Bill should contain order details", billDetails.contains(orderDetails));
//		assertTrue("Bill should contain payment method", billDetails.contains(paymentMethod));
	}

	@Then("the bill should be sent to the customer's email {string}")
	public void theBillShouldBeSentToTheCustomerSEmail(String email) {
//		boolean sent = mySystem.sendBillToEmail(email);
//		assertTrue("Bill should be sent to customer's email", sent);
	}

	@Then("the bill should be added to the customer's account order history")
	public void theBillShouldBeAddedToTheCustomerSAccountOrderHistory() {
//		mySystem.addBillToCustomerHistory(mySystem.getBillDetails());
//		assertTrue("Bill should be in customer's order history",
//				mySystem.customerHasBillInHistory(mySystem.getBillDetails()));
	}

	@Given("the admin is logged into the system")
	public void theAdminIsLoggedIntoTheSystem() {
//		mySystem.loginAdmin();
//		assertTrue("Admin should be logged in", mySystem.adminIsLoggedIn());
	}

	@Given("the admin has selected the {string} option")
	public void theAdminHasSelectedTheOption(String option) {
//		mySystem.selectAdminOption(option);
//		assertEquals("Admin should have selected the option", option, mySystem.getAdminSelectedOption());
	}

	@When("the admin selects a date range from {string} to {string}")
	public void theAdminSelectsADateRangeFromTo(String startDate, String endDate) {
//		mySystem.selectAdminDateRange(startDate, endDate);
//		assertEquals("Start date should be set", startDate, mySystem.getAdminStartDate());
//		assertEquals("End date should be set", endDate, mySystem.getAdminEndDate());
	}

	@Then("the system should generate the Financial Report for the selected date range")
	public void theSystemShouldGenerateTheFinancialReportForTheSelectedDateRange() {
//		mySystem.createFinancialReport(mySystem.getAdminStartDate(), mySystem.getAdminEndDate());
//		mySystem.generateFinancialReport();
//		assertNotNull("Financial report should be generated", mySystem.getAdminStartDate());
	}

	@Then("the system should send the Financial Report to the admin via email")
	public void theSystemShouldSendTheFinancialReportToTheAdminViaEmail() {
//		boolean sent = mySystem.sendFinancialReportToEmail("admin1@example.com");
//		assertTrue("Financial report should be sent to admin's email", sent);
	}

	@Then("the admin should be able to save the Financial Report as a PDF")
	public void theAdminShouldBeAbleToSaveTheFinancialReportAsAPDF() {
//		boolean saved = mySystem.saveFinancialReportAsPDF();
//		assertTrue("Financial report should be saved as PDF", saved);
	}
}