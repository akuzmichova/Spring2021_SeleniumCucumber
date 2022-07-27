Feature: Your Teacher Order

  Scenario: Verify YTO-By Flyer jumper
    When On Scholastic Homepage I click Sign In
    And I enter 'peterpen@gmail.com' email into email address field and click Continue button
    And I enter 'password123' into password field and click Sign In button
    When I hover over ENTER ORDERS tab and select YOUR TEACHER ORDER from drop-down
    And On BY FLYER tab I click on Price-QTY box
    Then I verify teacher sees a jumper above the box with Heading 'IMPORTANT' and Message 'All student paper flyer orders MUST be entered in the Student Flyer Orders tab.'
    When I enter '4' in the clicked Price-QTY box
    And I click on X on the jumper
    When I click on another Price-QTY box
    Then I verify teacher does NOT see any jumper









