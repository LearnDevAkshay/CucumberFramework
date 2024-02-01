Feature: To test date picker

  Background: To navigate to website
    Given user is on demoqa website

  @SeleniumTest @DatePicker
  Scenario: To test auto complete
    Given user click on Widget Section
    When user click on date picker widget section
    Then user enters date into input box
