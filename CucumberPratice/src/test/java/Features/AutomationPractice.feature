Feature: Login feature for Automation Practice Site


  Scenario: Login with correct username and password
    Given User arrives to homepage
    And clicks login button
    And User enters yourgymleader@gmail.com and H@rL3m
    When user clicks signin button
    Then user reaches profile screen

  Scenario: Login with correct username and password for invalid test
    Given User arrives to homepage
    And clicks login button
    And User enters yourgymleader@gmail.com and H@rL3m
    When user clicks signin button
    Then user reaches profile screen wrong page
