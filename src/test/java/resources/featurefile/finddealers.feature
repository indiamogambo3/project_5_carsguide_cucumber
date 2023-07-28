Feature: Find the dealers and verify
  As a user i want to verify that the dealers are on the list

  Scenario Outline: Find the dealers and verify the dealers are on the list
    Given I am on home page
    When I mouse hover on buy + sell tab
    And I click on find a dealer
    Then I should navigate to car dealers page
    And I should see the dealers name is displayed on page "<dealers name>"
    Examples:
      | dealers name            |
      | 3 Point Motors Epping   |
      | 4WD Specialist Group    |
      | 5 Star Auto             |
      | A & M Car Sales Pty Ltd |
      | A1 MOTORS COMPANY       |
      | ANDREA MOTORI SERVICE   |
      | Oxford Motors           |