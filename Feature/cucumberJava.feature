Feature: CucumberJava
  Scenario: Login functionality exists
    Given I have opened the browser
    When I open Facebook website
    Then Login button exists
    And User name field exists
    And Password field exists