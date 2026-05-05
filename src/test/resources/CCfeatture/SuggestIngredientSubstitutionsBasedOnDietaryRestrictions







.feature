Feature: Suggest Ingredient Substitutions Based on Dietary Restrictions

  As a customer, I want the system to suggest alternative ingredients  
  if an ingredient is unavailable or does not fit my dietary restrictions  
  so that I can enjoy my meal without compromising my health.  
  As a chef, I want to receive an alert when an ingredient substitution is applied  
  so that I can approve or adjust the final recipe.  

  Scenario: Customer receives ingredient substitution suggestions  
    Given the customer has selected ingredients for their meal  
    When the customer submits the meal request  
    And an ingredient is unavailable or does not fit dietary restrictions  
    Then the system suggests alternative ingredients  
    And the customer can choose from the suggested substitutions  

  Scenario: Chef receives alert for ingredient substitution  
    Given the chef is reviewing a customer's meal order  
    When the system applies an ingredient substitution  
    Then the chef receives an alert about the substitution  
    And the chef can approve or adjust the final recipe  
