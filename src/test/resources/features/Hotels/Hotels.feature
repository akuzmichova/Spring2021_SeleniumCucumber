Feature: Hotels

  Scenario: Verify past date and back button on Current month's calendar is disabled
    When On Hotels.com Homepage I click on Check in Calendar
    Then I verify for current month past dates are disabled
    And I verify back button on current month is disabled

  Scenario: Verify user can update number of guests on Landing page
    When On Hotels.com Homepage I click on Guests
    And I select 'Adults' as '4'
    And I select 'Children' as '2'
    And I select first child age as '4'
    And I select second child age as <1
    Then I verify on Rooms pop-up, number of adults and children same as selected on step #3 and #4
    When I click Apply button
    Then I verify total number of guests in sum of adults and children is same as selected on step #3 and #4

  Scenario: Verify CHANGE DATES button is displayed at the end of search results
    When On Hotels.com Homepage I enter 'bora' in destination
    And I select 'Bora Bora, French Polynesia' from auto suggestion
    When I select October 10, 2021 as Check-in and October 31, 2021 as Check-out
    When I click Apply button
    And I click on Search button
    Then I verify at the end of search results, CHANGE DATES button is displayed and enabled