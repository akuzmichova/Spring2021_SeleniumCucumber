Feature: Create new account

  Scenario: Teacher can add books in Recommendations List from Quick View
    When On Scholastic Homepage I click Sign In
    And I enter 'peterpen@gmail.com' email into email address field and click Continue button
    And I enter 'password123' into password field and click Sign In button
    When I enter 'Harry' into search field and click search button
    And I click Quick Look button on a book on PDP page
    And I click Recommended button on Quick Look window
    And I click Recommendations to Students check box in Add to my List pop-up window and close it
    And I close Quick Look window
    When I click on My List button and click Recommendations for Students link
    Then I verify the item is added in Recommendations to Students Lists under My Lists










