Feature: LoginFeature
  This feature deals wih the login functionality of the application

  Scenario: Login with correct username and password
    Given User naviagtes to login page
    And User enters the following for Login
      | username | password      |
      | admin    | adminPassword |
    When User clicks login button
    Then User should see the userform page


  Scenario Outline: Login with correct username and password using Scenario outline
    Given User naviagtes to login page
    And User enters <username> and <password>
    When User clicks login button
    Then User should see the userform page

    Examples:
      | username | password |
      | clacey88 | blahblah |
      | Homer    | Marge123 |


  Scenario Outline: Login with correct username and password for concat
    Given User naviagtes to login page
    And User enters the following email address as Email:<email>
    When User clicks login button
    Then User should see the userform page

    Examples:
      | email    |
      | admin    |
      | clacey88 |
