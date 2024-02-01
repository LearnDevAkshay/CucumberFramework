Feature: To autocomplete input


  Background: To navigate to website
    Given user is on demoqa website

  @SeleniumTest @AutoComplete
  Scenario: To test auto complete
    Given user click on Widget Section
    And user click on auto complete widget section
    When user enters text into input box
    Then user click on auto complete suggestion