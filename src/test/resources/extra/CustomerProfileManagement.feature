Feature: Customer Profile Management

  Scenario: Customer enters dietary preferences
    Given the customer is logged in
    When they navigate to their profile page
    And they select their dietary preferences
    Then the system saves the preferences

  Scenario: Customer enters allergies
    Given the customer is logged in
    When they navigate to their profile page
    And they enter their allergies
    Then the system saves the allergies

  Scenario: Chef views customer dietary preferences
    Given the chef is logged in
    When they select a customer's profile
    Then they can see the customer's dietary preferences and allergies

  Scenario: Customer views past orders
    Given the customer is logged in
    When they go to their order history
    Then they see a list of past orders
    And they can select an order to reorder

  Scenario: Chef views customer's order history
    Given the chef is logged in
    When they select a customer's profile
    Then they can see the customer's order history

  Scenario: System administrator retrieves order history for analysis
    Given the system administrator is logged in
    When they request order history reports
    Then they receive data on customer orders for analysis