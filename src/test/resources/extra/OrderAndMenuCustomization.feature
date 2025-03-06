Feature: Order and Menu Customization

  Scenario: Customer creates a custom meal request
    Given the customer is logged in
    When they start a new meal order
    And they select ingredients for the meal
    Then the system allows them to customize the meal

  Scenario: System validates ingredient combinations
    Given the customer is creating a custom meal
    When they select an incompatible ingredient
    Then the system displays a message about the incompatibility

  Scenario: System suggests substitutions for dietary restrictions
    Given the customer has a dietary restriction
    When they select an ingredient that doesn't fit the restriction
    Then the system suggests an alternative ingredient

  Scenario: System suggests substitutions for unavailable ingredients
    Given an ingredient is unavailable
    When the customer selects that ingredient
    Then the system suggests an available alternative

  Scenario: Chef receives alert for ingredient substitution
    Given a customer order has an ingredient substitution
    When the order is assigned to the chef
    Then the chef receives an alert about the substitution