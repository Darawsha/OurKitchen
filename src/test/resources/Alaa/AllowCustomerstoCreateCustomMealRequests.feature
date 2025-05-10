Feature: Allow Customers to Create Custom Meal Requests
  As a customer, I want to select ingredients and customize my meal
  so that I can order meals according to my taste and dietary needs.
  As a system, I want to validate ingredient combinations
  so that customers do not select incompatible or unavailable ingredients.

  Scenario: Customer creates a custom meal request
    Given the customer is logged into the system
    When the customer selects ingredients to customize their meal
    Then the system displays available ingredients for the customer to choose from
    And the customer can finalize and place the order based on their preferences

  Scenario: System validates ingredient combinations
    Given the customer has selected ingredients for their meal
    When the customer submits the custom meal request
    Then the system validates the ingredient combination
    And the system notifies the customer if any ingredient is incompatible or unavailable
