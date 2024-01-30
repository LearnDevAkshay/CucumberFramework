Feature: To validate selenium browse window function


  Background: To navigate to website
    Given user is on demoqa website


    @SeleniumTest @BrowseWindow @NewTab
  Scenario: To test new tab
    Given user click on AlertWindow
    And user click on BrowseWindow
    When user click on new tab button
    Then new tab will open

  @SeleniumTest @BrowseWindow @NewWindow
  Scenario: To test new window
    Given user click on AlertWindow
    And user click on BrowseWindow
    When user click on new window button
    Then new window will open

  @SeleniumTest @BrowseWindow @NewMessageWindow
  Scenario: To test new window message
    Given user click on AlertWindow
    And user click on BrowseWindow
    When user click on new message window button
    Then new window with message will open

