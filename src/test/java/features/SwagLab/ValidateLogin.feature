Feature: Validate user login

  Background: To navigate to login page
    Given user is on Login page using browser

  @SeleniumTest @User1
  Scenario: To Login the Swag Lab using user1
    When user enters "standard_user" and "secret_sauce"
    Then User navigate to home page

  @SeleniumTest @User2
  Scenario: To Login the Swag Lab using user2
    When user enters "locked_out_user" and "secret_sauce"
    Then User navigate to home page


