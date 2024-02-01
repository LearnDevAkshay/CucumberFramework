Feature: To test accordian


  Background: To navigate to website
    Given user is on demoqa website

  @SeleniumTest @Accordian
  Scenario: To test accordian
    Given user click on Widget Section
    And user click on accordian Widget button
    When user click on closed paragraph
    Then paragraph will expand with content
