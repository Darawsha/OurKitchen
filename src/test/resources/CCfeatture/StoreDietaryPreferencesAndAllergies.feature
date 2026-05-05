Feature: Store Dietary Preferences and Allergies

  As a customer, I want to input my dietary preferences and allergies  
  so that the system can recommend appropriate meals and prevent unwanted ingredients.  
  As a chef, I want to view customer dietary preferences  
  so that I can customize meals accordingly.  

  Scenario: Customer inputs dietary preferences and allergies  
    Given the customer is logged into the system  
    When the customer navigates to the dietary preferences section  
    And enters their dietary preferences and allergies  
    Then the system stores the preferences  
    And recommends appropriate meals based on the input  

  Scenario: Chef views customer dietary preferences  
    Given the chef is logged into the system  
    When the chef accesses a customer's meal order  
    Then the system displays the customer's dietary preferences and allergies  
    And the chef customizes the meal accordingly  
