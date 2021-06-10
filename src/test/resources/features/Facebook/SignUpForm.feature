@regression
Feature: SignUpForm

  Scenario: No gender-radio button is selected on Facebook sign up form
    When On Facebook Homepage I click on Create new account button
    Then I verify no gender-radio button is selected on Facebook sign up form


