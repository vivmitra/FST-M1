@activity1
Feature: Web Search

Scenario: Searching for Cheese on Google
  Given User is on Google Home Page
  When User types Cheese and hits enter
  Then Search results are shown
  And Close the browser