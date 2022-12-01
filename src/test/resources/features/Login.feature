Feature: User Login

  @regression @smoke
  Scenario: User is able to login with valid credentials
    Given user enters valid username in email field
    And   user enters valid password in password field
    When  user clicks on login button
    Then  user is logged in successfully

  @regression
  Scenario Outline: User is not able to login with invalid credentials
    Given user enters invalid <email> in email field
    And   user enters invalid <password> in password field
    When  user clicks on login button
    Then  error <message> is displayed

    Examples:
      | email           | password  | message                                               |
      | sadiq@gmail.com | 1234      | Warning: No match for E-Mail Address and/or Password. |
      | test@gmail.com  | test1234  | Warning: No match for E-Mail Address and/or Password. |
      | test1@gmail.com | test@1234 | Warning: No match for E-Mail Address and/or Password. |