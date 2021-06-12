$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Darksky/TempTimeline.feature");
formatter.feature({
  "line": 2,
  "name": "TempTimeline",
  "description": "",
  "id": "temptimeline",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 12082841500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify temp timeline is displayed for every 2 hours from current time with total 12 time-data-points",
  "description": "",
  "id": "temptimeline;verify-temp-timeline-is-displayed-for-every-2-hours-from-current-time-with-total-12-time-data-points",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I verify temp timeline is displayed for every 2 hours from current time with total 12 time-data-points",
  "keyword": "Then "
});
formatter.match({
  "location": "TempTimelineSD.verifyTempTLDisplayedFormat()"
});
formatter.result({
  "duration": 9618908500,
  "status": "passed"
});
formatter.after({
  "duration": 1175298900,
  "status": "passed"
});
formatter.uri("Darksky/WeeklyForecast.feature");
formatter.feature({
  "line": 2,
  "name": "WeeklyForecast",
  "description": "",
  "id": "weeklyforecast",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 8928863600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "TempValues (low and high) on timeline are the same as tempValue in the Today\u0027s detail",
  "description": "",
  "id": "weeklyforecast;tempvalues-(low-and-high)-on-timeline-are-the-same-as-tempvalue-in-the-today\u0027s-detail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on darksky home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Today plus button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify tempValues on timeline are the same as tempValue in the Today\u0027s detail",
  "keyword": "Then "
});
formatter.match({
  "location": "WeeklyForecastSD.openDarksky()"
});
formatter.result({
  "duration": 12051095700,
  "status": "passed"
});
formatter.match({
  "location": "WeeklyForecastSD.clickTodayPlusButton()"
});
formatter.result({
  "duration": 1666056400,
  "status": "passed"
});
formatter.match({
  "location": "WeeklyForecastSD.verifyTempValuesTL()"
});
formatter.result({
  "duration": 207938100,
  "status": "passed"
});
formatter.after({
  "duration": 2893512000,
  "status": "passed"
});
formatter.before({
  "duration": 13423721400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Current date is selected in the Time machine drop down calendar",
  "description": "",
  "id": "weeklyforecast;current-date-is-selected-in-the-time-machine-drop-down-calendar",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on darksky home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I scroll to Time Machine button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click Time Machine button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify current date is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "WeeklyForecastSD.openDarksky()"
});
formatter.result({
  "duration": 15958773800,
  "status": "passed"
});
formatter.match({
  "location": "WeeklyForecastSD.scrollToTimeMachineButton()"
});
formatter.result({
  "duration": 561618300,
  "status": "passed"
});
formatter.match({
  "location": "WeeklyForecastSD.clickTimeMachineButton()"
});
formatter.result({
  "duration": 75244000,
  "status": "passed"
});
formatter.match({
  "location": "WeeklyForecastSD.verifyCurrentDateSelected()"
});
formatter.result({
  "duration": 239042100,
  "status": "passed"
});
formatter.after({
  "duration": 1393253200,
  "status": "passed"
});
formatter.uri("Facebook/Messenger.feature");
formatter.feature({
  "line": 2,
  "name": "Messenger",
  "description": "",
  "id": "messenger",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 8259372900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User see \"Incorrect email or phone number\" error msg when login with no credentials on facebook messenger",
  "description": "",
  "id": "messenger;user-see-\"incorrect-email-or-phone-number\"-error-msg-when-login-with-no-credentials-on-facebook-messenger",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "On Facebook Homepage I click on Messenger link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "On Messenger page I click on Log In button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I verify error message \"Incorrect email or phone number\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MessengerSD.clickMessenger()"
});
formatter.result({
  "duration": 2684109200,
  "status": "passed"
});
formatter.match({
  "location": "MessengerSD.clickMessengerLogInButton()"
});
formatter.result({
  "duration": 1252305100,
  "status": "passed"
});
formatter.match({
  "location": "MessengerSD.verifyErrorMessageDisplayed()"
});
formatter.result({
  "duration": 36824600,
  "status": "passed"
});
formatter.after({
  "duration": 1126074100,
  "status": "passed"
});
formatter.uri("Facebook/SignUpForm.feature");
formatter.feature({
  "line": 2,
  "name": "SignUpForm",
  "description": "",
  "id": "signupform",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 7639809600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "No gender-radio button is selected on Facebook sign up form",
  "description": "",
  "id": "signupform;no-gender-radio-button-is-selected-on-facebook-sign-up-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "On Facebook Homepage I click on Create new account button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I verify no gender-radio button is selected on Facebook sign up form",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpFormSD.clickCreateNewAccountButtonHP()"
});
formatter.result({
  "duration": 98533400,
  "status": "passed"
});
formatter.match({
  "location": "SignUpFormSD.verifyGenderButtonsSelected()"
});
formatter.result({
  "duration": 367230000,
  "status": "passed"
});
formatter.after({
  "duration": 750280300,
  "status": "passed"
});
});