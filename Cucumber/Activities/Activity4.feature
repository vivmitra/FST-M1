@activity4
Feature: Login Test

  Scenario: Testing Login without Examples
    Given User on Login page
    When User enters "admin" and "password"
    Then Read page title and confirmation message
    And Close Browsers