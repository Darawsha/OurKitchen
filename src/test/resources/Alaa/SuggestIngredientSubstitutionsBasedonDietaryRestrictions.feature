Feature: Suggest Ingredient Substitutions Based on Dietary Restrictions
  As a customer, I want the system to suggest alternative ingredients
  if an ingredient is unavailable or does not fit my dietary restrictions
  so that I can enjoy my meal without compromising my health.
  As a chef, I want to receive an alert when an ingredient substitution is applied
  so that I can approve or adjust the final recipe.

  Scenario: System suggests alternative ingredients
    Given the customer has selected an ingredient that is unavailable or restricted
    When the system detects the issue
    Then the system suggests suitable ingredient substitutions
    And the customer can confirm or decline the substitution

  Scenario: Chef receives substitution alert
    Given the chef is preparing a customized meal
    When the system applies a substitution based on restrictions
    Then the system notifies the chef of the substitution
    And the chef can approve or modify the final recipe
