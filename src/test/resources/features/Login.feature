Feature: User Login

  Scenario: User is able to login with valid credentials
    Given user enters valid username in email field
    And   user enters valid password in password field
    When  user clicks on login button
    Then  user is logged in successfully

  Scenario: User is not able to login with invalid credentials
    Given user enters invalid username in email field
    And   user enters invalid password in password field
    When  user clicks on login button
    Then  error message is displayed