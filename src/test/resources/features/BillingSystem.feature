@tag
Feature: Invoice Generation for Customers and Financial Report Generation
  
  @tag1
  Scenario Outline: Invoice Generation for Customers
    Given the customer has logged in successfully
    And the customer has successfully completed their order
    And the order has been successfully processed
    When the system creates the bill
    Then the bill should contain the customer's name "<Customer_Name>", order number "<Order_Number>", date of order "<Order_Date>", cost "<Cost>", order details "<Order_Details>", and payment method "<Payment_Method>"
    And the bill should be sent to the customer's email "<Customer_Email>"
    And the bill should be added to the customer's account order history

    Examples:
      | Customer_Name | Order_Number | Order_Date | Cost | Order_Details        | Payment_Method | Customer_Email      |
      | Ameed         | 12345        | 2025-03-01 | 100  | Kabsa                | Credit Card    | Ameed@gmail.com     |
      | Alaa          | 12346        | 2025-03-02 | 150  | Burger               | Apple Pay      | Alaa@gmail.com      |
      | Oqab          | 12347        | 2025-03-03 | 200  | Maqluba              | Cash           | Oqab@gmail.com      |

  @tag2
  Scenario Outline: Financial Report Generation
    Given the admin is logged into the system
    And the admin has selected the "Financial Report" option
    When the admin selects a date range from "<Start_Date>" to "<End_Date>"
    Then the system should generate the Financial Report for the selected date range
    And the system should send the Financial Report to the admin via email
    And the admin should be able to save the Financial Report as a PDF

    Examples:
      | Start_Date  | End_Date    |
      | 2025-01-01  | 2025-01-31  |
      | 2025-02-01  | 2025-02-28  |
      | 2025-03-01  | 2025-03-31  |
      
      
      
