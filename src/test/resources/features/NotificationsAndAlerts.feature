Feature: Notifications and Alerts

  Scenario: Customer receives reminder for upcoming delivery
    Given the customer has an upcoming delivery
    When it is 24 hours before delivery
    Then the customer receives a reminder notification

  Scenario: Chef receives notification for scheduled cooking task
    Given the chef has a scheduled cooking task
    When it is time to start preparing
    Then the chef receives a notification

  Scenario: Kitchen manager receives low-stock alert
    Given an ingredient's stock is low
    Then the kitchen manager receives an alert