Feature: Homework5

  Scenario: TempValues (low and high) on timeline are the same as tempValue in the Today's detail
    Given I am on darksky home page
      When I scroll to Today timeline
      And I click the plus button
    Then I verify tempValues on timeline are the same as tempValue in the Today's detail

  Scenario: Current date is selected in the Time machine drop down calendar
    Given I am on darksky home page
      When I scroll to Time Machine button
      And I click Time Machine button
    Then I verify current date is selected
