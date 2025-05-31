package tests;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.*;

public class OrderDeliveryRemindersSteps {

	private MySystem mySystem;

	public OrderDeliveryRemindersSteps(MySystem mySystem) {
		this.mySystem = mySystem;
	}

	@Given("a customer has an upcoming meal delivery scheduled")
	public void aCustomerHasAnUpcomingMealDeliveryScheduled() {
		//mySystem.getCustomerService().createOrder("Grilled Chicken", "2025-05-11T12:00:00");
		//boolean scheduled = mySystem.getCustomerService().scheduleOrder();
	//	assertTrue("Meal delivery should be scheduled", scheduled);
	}

	@Given("the delivery time is approaching")
	public void theDeliveryTimeIsApproaching() {
	//	String upcomingTime = LocalDateTime.now().plusMinutes(15).toString();
	//	mySystem.getCustomerService().createOrder("Grilled Chicken", upcomingTime);
	//	mySystem.scheduleOrder();
	//	boolean isApproaching = mySystem.isDeliveryTimeApproaching();
	//	assertTrue("Delivery time should be considered approaching", isApproaching);
	}

	@When("the reminder time is reached")
	public void theReminderTimeIsReached() {
	//	mySystem.checkOrderReminder();
	}

	@Then("the customer receives a reminder notification")
	public void theCustomerReceivesAReminderNotification() {
	//	assertTrue("The customer should receive a reminder notification",
	//			mySystem.customerHasReceivedReminderNotification());
	}

	@Then("the reminder includes the delivery time and order details")
	public void theReminderIncludesTheDeliveryTimeAndOrderDetails() {
	//	String reminderMessage = mySystem.getCustomerReminderMessage();
	//	assertTrue("Reminder should include delivery time", reminderMessage.contains("2025-05-11T12:00:00"));
	//	assertTrue("Reminder should include order details", reminderMessage.contains("Grilled Chicken"));
	}

	@Given("a chef has scheduled cooking tasks for upcoming orders")
	public void aChefHasScheduledCookingTasksForUpcomingOrders() {
	//	mySystem.createOrder("Grilled Chicken", "2025-05-11T12:00:00");
	//	boolean scheduled = mySystem.scheduleCookingTask("2025-05-11T11:30:00");
	//	assertTrue("Cooking task should be scheduled", scheduled);
	//	assertEquals("Chef should have 1 scheduled task", 1, mySystem.getChefScheduledTasks().size());
	//	assertEquals("The cooking task should be for Grilled Chicken", "Grilled Chicken",
	//			mySystem.getChefScheduledTasks().get(0).getOrder().getMeal());
	//	assertEquals("The cooking time should be 2025-05-11T11:30:00", "2025-05-11T11:30:00",
	//			mySystem.getChefScheduledTasks().get(0).getCookingTime());
	}

	@Given("the preparation time is approaching")
	public void thePreparationTimeIsApproaching() {
	//	mySystem.createOrder("Grilled Chicken", "2025-05-11T12:00:00");
	//	String upcomingCookingTime = LocalDateTime.now().plusMinutes(15).toString();
	//	mySystem.scheduleCookingTask(upcomingCookingTime);
	//	boolean isApproaching = mySystem.isCookingTaskPreparationTimeApproaching();
	//	assertTrue("Preparation time should be considered approaching", isApproaching);
	}

	@Then("the chef receives a notification to start cooking")
	public void theChefReceivesANotificationToStartCooking() {
	//	mySystem.checkCookingTaskReminder();
	//	assertTrue("The chef should receive a notification to start cooking",
	//			mySystem.chefHasReceivedCookingNotification());
	}

	@Then("the reminder includes the order details and cooking schedule")
	public void theReminderIncludesTheOrderDetailsAndCookingSchedule() {
	//	String reminderMessage = mySystem.getChefCookingReminderMessage();
	//	assertTrue("Reminder should include order details", reminderMessage.contains("Grilled Chicken"));
	//	assertTrue("Reminder should include cooking schedule", reminderMessage.contains("2025-05-11T11:30:00"));
	}
}