Feature: Assign Tasks to Chefs and Kitchen Staff
  As a kitchen manager, I want to assign tasks to chefs based on their workload and expertise
  so that I can ensure balanced workloads and efficiency.
  As a chef, I want to receive task assignments so that I know my responsibilities.

  Scenario: Kitchen manager assigns tasks
    Given the kitchen manager is logged into the system
    When the manager views chef workloads and specialties
    Then the manager assigns tasks to chefs accordingly
    And the system updates the task schedule

  Scenario: Chef receives task assignment
    Given the chef is logged into the system
    When the chef navigates to their task list
    Then the system displays the assigned tasks
    And the chef can acknowledge and start the tasks
