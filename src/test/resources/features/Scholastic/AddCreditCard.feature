Feature: Add credit card

  Scenario: Verify teacher can add only 3 credit cards under My Credit Cards in My Accounts
    Given I log in to Scholastic account with three credit cards stored using 'peterpen@gmail.com' login and 'password123' password
    When I click Payment Methods from My Account drop-down in the header
    And I click 'Add a Card' in 'My Credit Cards section'
    Then I verify that I get error msg 'You can only store three credit cards' if I try to add 4th credit card


