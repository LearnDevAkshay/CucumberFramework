Feature:  To test frames

  Background: To navigate to website
    Given user is on demoqa website

  @SeleniumTest @Frame @SimpleFrame
  Scenario: To test simple frame
    Given user click on AlertWindow
    When user click on frame widget button
    Then user read frame content

  @SeleniumTest @Frame @ComplexFrame
  Scenario: To test complex frame
    Given user click on AlertWindow
    When user click on frame widget button
    Then user read complex frame content

  @SeleniumTest @Frame @NestedFrame
  Scenario: To test nested frame
    Given user click on AlertWindow
    When user click on nested frame widget button
    Then user read the nested frame content