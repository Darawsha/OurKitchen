Feature: Billing System

  Scenario: Customer receives invoice after order
    Given the customer has placed an order
    When the order is confirmed
    Then the customer receives an invoice

  Scenario: System administrator generates financial reports
    Given the system administrator is logged in
    When they request a financial report
    Then the system generates the report with financial data