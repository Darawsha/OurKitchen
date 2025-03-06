Feature: Scheduling and Task Management

  Scenario: Kitchen manager assigns tasks to chefs
    Given the kitchen manager is logged in
    When they view pending orders
    And they select a chef based on workload and expertise
    Then they can assign the task to that chef

  Scenario: Chef receives notification of assigned task
    Given a task is assigned to the chef
    Then the chef receives a notification with task details