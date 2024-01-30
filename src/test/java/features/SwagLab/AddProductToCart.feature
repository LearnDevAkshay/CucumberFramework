Feature: validate end to end case

  Background: To navigate to login page
    Given user is on Login page using browser


@ProductAddToCart
Scenario: To product to cart
  Given user enters "standard_user" and "secret_sauce"
  And User navigate to home page
  And user clicks on Add to cart button
  And user clicks on cart link
  And user is navigated to checkout page
  When user checks on checkout button
  Then user is navigated to user detail page
