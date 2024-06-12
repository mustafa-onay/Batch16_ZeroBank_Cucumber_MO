@regression @smoke
Feature: Login Functionality
  @wip
  Scenario: Positive Login Tests
    Given The user is on the home page
    When The user clicks on the Signin button
    And The user enters valid credentials: "username" and "password"
    Then The user should be able to see "username" on the home page