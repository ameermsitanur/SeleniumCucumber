Feature: Customers

Background: common steps for below scenarios
    Given user lunch chrome browser
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And uesr enter email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then user can view a Dashboard
    When click on customer menu
    And click on customers menu item   

Scenario: Add a new Customer
    And click on add new button
    Then user can view and add a new customer page
    When user enter customer info
    And click on save button
    When user can view confirmation message "The new customer has been added successfully."
    And close the browser
   
Scenario: search customer by EmailId
    And enter customer email
    When click on search button
    Then user should found email in the search table
    And close the browser
    
Scenario: search customer by Firstname and Lastname
    And enter customer firstname
    And enter customer lastname
    When user should found name in the search table
    And close the browser
    