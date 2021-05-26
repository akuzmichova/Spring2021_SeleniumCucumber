Feature: Current date is selected

  Scenario: Current date is selected in the Time machine drop down calendar
    Given I am on darksky home page
    When I scroll to Time Machine button
    And I click Time Machine button
    Then I verify current date is selected