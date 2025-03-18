#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Send reminders for upcoming orders and deliveries
As a customer, I want to receive reminders for my upcoming meal deliveries so that I can
be prepared to receive them.
As a chef, I want to get notified of scheduled cooking tasks so that I can prepare meals
on time.
@tag1
Scenario: Send reminders to customer to get ready to receive the order
Given a customer has an upcoming meal delivery scheduled
And the delivery time is approaching
When the reminder time is reached
Then the customer receives a reminder notification
And the reminder includes the delivery time and order details

@tag2
Scenario: Send reminders to the chef to start preparing meals
Given a chef has scheduled cooking tasks for upcoming orders
And the preparation time is approaching
When the reminder time is reached
Then the chef receives a notification to start cooking
And the reminder includes the order details and cooking schedule