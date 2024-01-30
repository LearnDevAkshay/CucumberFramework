Feature: To Test Alert

  Background: To navigate to website
    Given user is on demoqa website

  @SeleniumTest @Alert @SimpleAlert
  Scenario: To test simple alert
    Given user click on AlertWindow
    And user click on Alerts widget button
    When user click in alert button
    Then Alert will pop up

  @SeleniumTest @Alert @TimerAlert
  Scenario: To test timer alert
    Given user click on AlertWindow
     And user click on Alerts widget button
    When user click in alert button with delay
    Then Alert will pop up

  @SeleniumTest @Alert @AlertWithConfirm
  Scenario: To test alert with confirm box
    Given user click on AlertWindow
    And user click on Alerts widget button
    When user click in alert button with confirm box
    Then Alert will pop up and user will click on confirm

  @SeleniumTest @Alert @AlertWithPrompt
  Scenario: To test alert with input box
    Given user click on AlertWindow
    And user click on Alerts widget button
    When user click in alert button with input box
    Then Alert will pop up and user will enter text in pop up box

