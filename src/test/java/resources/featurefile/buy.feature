Feature: Search Functionality
  As a user I want to search buy car with model name

  @smoke @regression
  Scenario Outline: Search the buy car with model name
    Given I am on home page
    When I mouse hover on buy + sell tab
    And I click on Search Cars link
    Then I should navigate to new and used car page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on find my next car tab
    Then I should see the make in results "<results>"
    Examples:
      | make          | model              | location            | price   | results       |
      | Honda         | Civic              | NSW - Central Coast | $10,000 | Honda         |
      | Land Rover    | Range Rover Evoque | NSW - New England   | $25,000 | Land Rover    |
      | Mercedes-Benz | SLK-Class          | NSW - Sydney        | $45,000 | Mercedes-Benz |
      | Jaguar        | E-Pace             | NSW - Hunter        | $70,000 | Jaguar        |
      | Audi          | Q5                 | NSW - All           | $30,000 | Audi          |
      | Tesla         | Model Y            | NT - North          | $90,000 | Tesla         |

  @sanity @regression
  Scenario Outline: Search the used with model name
    Given I am on home page
    When I mouse hover on buy + sell tab
    And I click on used link
    Then I should navigate to used cars for sale page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on find my next car tab
    Then I should see the make in results "<results>"
    Examples:
      | make          | model              | location            | price   | results       |
      | Honda         | Civic              | NSW - Central Coast | $10,000 | Honda         |
      | Land Rover    | Range Rover Evoque | NSW - New England   | $25,000 | Land Rover    |
      | Mercedes-Benz | SLK-Class          | NSW - Sydney        | $45,000 | Mercedes-Benz |
      | Jaguar        | E-Pace             | NSW - Hunter        | $70,000 | Jaguar        |
      | Audi          | Q5                 | NSW - All           | $30,000 | Audi          |
      | Tesla         | Model Y            | NT - North          | $90,000 | Tesla         |