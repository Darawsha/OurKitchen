Feature: AI Assistance

  Scenario: System recommends recipes based on customer preferences
    Given the customer requests recipe recommendations
    When the system sends preferences and available ingredients to the AI assistant
    Then the system displays the recommended recipes to the customer