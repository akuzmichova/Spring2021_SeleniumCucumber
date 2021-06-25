Feature: Student Flyer Orders

  Scenario: Verify user can delete item on Cart page
    When On Scholastic Homepage I click Sign In
    And I enter 'peterpen@gmail.com' email into email address field and click Continue button
    And I enter 'password123' into password field and click Sign In button
    When I hover over ENTER ORDERS tab and select STUDENT FLYER ORDERS from drop-down
    And I input 'Harry' in the Enter Student Name field
    And I input '2S8' in the Item field and click Add button
    And I input quantity '5' in QTY field for this item
    And I input '11S8' in the Item field and click Add button
    And I input quantity '1' in QTY field for this item
    When I input 'John' in the Enter Student Name field
    And I input '2S8' in the Item field and click Add button
    And I input quantity '2' in QTY field for this item
    And I input '14G8' in the Item field and click Add button
    And I input quantity '2' in QTY field for this item
    When I input 'Michael' in the Enter Student Name field
    And I input '4G8' in the Item field and click Add button
    And I input quantity '4' in QTY field for this item
    And I input '1G8' in the Item field and click Add button
    And I input quantity '10' in QTY field for this item
    When I click on REVIEW CART button
    And I click on 'X' button corresponding to 2S8 item for Harry
    And I click YES button in 'Delete this Item' pop-up
    Then I verify Harry Total Price and Qty get updated
    And I verify Order Total Price and Qty get updated
    And I verify for Harry, item 2S8 gets deleted

  Scenario: Verify teacher gets error for invalid item number in SFO (Student Flyer Order)
    When On Scholastic Homepage I click Sign In
    And I enter 'peterpen@gmail.com' email into email address field and click Continue button
    And I enter 'password123' into password field and click Sign In button
    When I hover over ENTER ORDERS tab and select STUDENT FLYER ORDERS from drop-down
    And I input 'Harry' in the Enter Student Name field
    And I input '111' in the Item field and click Add button
    Then I verify expected error msg: 'Please enter a valid item number.'

  Scenario: Verify zero tax for only SFO order in the checkout
    When On Scholastic Homepage I click Sign In
    And I enter 'peterpen@gmail.com' email into email address field and click Continue button
    And I enter 'password123' into password field and click Sign In button
    When I hover over ENTER ORDERS tab and select STUDENT FLYER ORDERS from drop-down
    And I input 'Harry' in the Enter Student Name field
    And I input '2S8' in the Item field and click Add button
    And I input quantity '5' in QTY field for this item
    And I input '11S8' in the Item field and click Add button
    And I input quantity '1' in QTY field for this item
    When I input 'John' in the Enter Student Name field
    And I input '2S8' in the Item field and click Add button
    And I input quantity '2' in QTY field for this item
    And I input '14G8' in the Item field and click Add button
    And I input quantity '2' in QTY field for this item
    When I input 'Michael' in the Enter Student Name field
    And I input '4G8' in the Item field and click Add button
    And I input quantity '4' in QTY field for this item
    And I input '1G8' in the Item field and click Add button
    And I input quantity '10' in QTY field for this item
    When I click on REVIEW CART button
    And I click to Proceed to Checkout button on Review your order page
    And I click to Proceed to Checkout button on Modal window page
    Then I verify Tax amount is '$0.00'

  Scenario: Verify non-zero tax is present for SFO-YTO orders in the checkout for teacher with tax state school
    Given I log in to Scholastic account with three credit cards stored using 'peterpenadak@gmail.com' login and 'password123' password
    When I hover over ENTER ORDERS tab and select STUDENT FLYER ORDERS from drop-down
    And I input 'Harry' in the Enter Student Name field
    And I input '1G8' in the Item field and click Add button
    And I input '11G8' in the Item field and click Add button
    And I input '3S8' in the Item field and click Add button
    And I input '4S8' in the Item field and click Add button
    When I click to Your Teacher Order tab
    And I select BY FLYER tab
    And On BY FLYER tab I click on Price-QTY box
    When I enter '2' in the clicked Price-QTY box
    When I click on another Price-QTY box
    When I enter '2' in the second clicked Price-QTY box
    When I click on REVIEW CART button on YTO page
    And I click to Proceed to Checkout button on Review your order page
    And I click to Proceed to Checkout button on Modal window page
    Then I verify Tax amount is '$0.00'










