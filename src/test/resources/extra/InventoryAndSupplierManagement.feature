Feature: Inventory and Supplier Management

  Scenario: Kitchen manager tracks ingredient stock levels
    Given the kitchen manager is logged in
    When they view the inventory
    Then they see current stock levels
    And low-stock ingredients are highlighted

  Scenario: System suggests restocking for low-stock ingredients
    Given an ingredient's stock is below threshold
    Then the system suggests restocking

  Scenario: System fetches real-time prices from suppliers
    Given the kitchen manager is viewing inventory or ordering
    Then the system displays current supplier prices

  Scenario: System generates purchase orders for critically low stock
    Given an ingredient's stock is critically low
    Then the system generates a purchase order
    And notifies the kitchen manager