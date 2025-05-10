Feature: Track Past Orders and Personalized Meal Plans
  As a customer, I want to view my past meal orders
  so that I can reorder meals I liked.
  As a chef, I want to access customers’ order history
  so that I can suggest personalized meal plans.
  As a system administrator, I want to store and retrieve customer order history
  so that I can analyze trends and improve service offerings.

  Scenario: Customer views past meal orders
    Given the customer is logged into the system
    When the customer navigates to the order history section
    Then the system displays a list of past meal orders
    And the customer can select a past order to reorder

  Scenario: Chef accesses customer order history
    Given the chef is logged into the system
    When the chef views a customer's profile
    Then the system displays the customer’s past meal orders
    And the chef can suggest a personalized meal plan based on the order history

  Scenario: System administrator manages order history
    Given the system administrator has access to the order database
    When the administrator retrieves customer order data
    Then the system provides detailed order history reports
    And the administrator can analyze trends and improve service offerings
