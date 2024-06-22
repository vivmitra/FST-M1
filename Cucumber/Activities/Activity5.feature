@activity5
Feature: Data driven test with Example

  Scenario Outline: Testing with Data from Scenario
    Given User is on Login Page
    When User enters "<Usernames>" And "<Passwords>"
    Then Read Page title and confirmation message
    And Close the Browsers

    Examples:
      | Usernames | Passwords |
      | admin     | password  |
      | adminUser | Password  |