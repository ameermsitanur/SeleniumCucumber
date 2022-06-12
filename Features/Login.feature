Feature: login

@sanity
Scenario: successful login with valid credentials
    Given user lunch chrome browser
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And uesr enter email as "admin@yourstore.com" and password as "admin"
    And click on login
    Then page tittle should be "Dashboard / nopCommerce administration"
    When user click on logout link
    Then page tittle should be "Your store. Login"
    And close the browser
    
 @regression   
Scenario Outline: Login data driven
     
    Given user lunch chrome browser
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And uesr enter email as "<email>" and password as "<password>"
    And click on login
    Then page tittle should be "Dashboard / nopCommerce administration"
    When user click on logout link
    Then page tittle should be "Your store. Login"
    And close the browser
    
    Examples:
    | email | password |
    | admin@yourstore.com | admin |
    | admin1@yourstore.com | admin123 |
    