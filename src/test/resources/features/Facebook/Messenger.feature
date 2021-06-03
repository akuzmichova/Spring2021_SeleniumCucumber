Feature: Messenger


  Scenario: User see "Incorrect email or phone number" error msg when login with no credentials on facebook messenger
    When On Facebook Homepage I click on Messenger link
      And On Messenger page I click on Log In button
    Then I verify error message "Incorrect email or phone number" is displayed

