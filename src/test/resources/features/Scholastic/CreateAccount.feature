Feature: Create new account

  Scenario: User can create a new teacher account in taxable state using Zip Code
    When On Scholastic Homepage I click on Create an Account
    And I click on Teacher/Administrator/Homeschooler radio button and click Next
    When I choose Mr. Title from Title drop-down
    And I enter 'Tom' in First Name field
    And I enter 'Ford' in Last Name field
    And I enter 'tomfordlklqwerty@gmail.com' in Email Address field
    And I enter 'password123' in Password field
    And I click Terms of Use and Privacy Policy checkbox and click Next
    When I input '10012' zip code and click Search
    And I input 'Scholastic+Book+Club' into School Name field
    And I choose 'Scholastic+Book+Clubs' from drop autosuggestion list and click Next
    When I choose Teacher 'by Grade' from Role drop-down
    And I choose 1st Grade from Grade drop-down
    And I input '1' in Number of Sturents field and click Next
    When I choose Guided Reading Level 'GRL' from Preferred Reading Level System drop-down and click Continue to Site button
    Then I verify CLASS CODE allocated to the teacher, present on Home-Page
    And I verify CLASS CODE allocated to the teacher, present on MyAccount-Page
    And I verify same Teacher name is present on My Accounts
    And I verify same school address is present as selected while creating the account

  Scenario: User can create a new teacher account in taxable state using School Search
    When On Scholastic Homepage I click on Create an Account
    And I click on Teacher/Administrator/Homeschooler radio button and click Next
    When I choose Mr. Title from Title drop-down
    And I enter 'Tom' in First Name field
    And I enter 'Ford' in Last Name field
    And I enter 'tomfordqwersgty@gmail.com' in Email Address field
    And I enter 'password123' in Password field
    And I click Terms of Use and Privacy Policy checkbox and click Next
    When I select 'New York' state from Search By State And City State drop-down
    And I select 'New York' city from City drop-down and click Search
    #And I input 'Scholastic+Book+Club' into School Name field
    #And I choose 'Scholastic+Book+Clubs' from drop autosuggestion list and click Next
    #When I choose Teacher 'by Grade' from Role drop-down
    #And I choose 1st Grade from Grade drop-down
    #And I input '1' in Number of Sturents field and click Next
    #When I choose Guided Reading Level 'GRL' from Preferred Reading Level System drop-down and click Continue to Site button
    #Then I verify CLASS CODE allocated to the teacher, present on Home-Page
    #And I verify CLASS CODE allocated to the teacher, present on MyAccount-Page
    #And I verify same Teacher name is present on My Accounts
    #And I verify same school address is present as selected while creating the account


