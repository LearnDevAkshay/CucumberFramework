Feature: To test modal dialogs

  Background: To navigate to website
    Given user is on demoqa website

  @SeleniumTest @ModalDialogs @SmallDialog
  Scenario: To test small dialog
    Given user click on AlertWindow
    And user click on modal dialogs widget button
    When user click on small dialog button
    Then small dialog will pop

  @SeleniumTest @ModalDialogs @LargeDialog
  Scenario: To test large dialog
    Given user click on AlertWindow
    And user click on modal dialogs widget button
    When user click on large dialog button
    Then large dialog will pop