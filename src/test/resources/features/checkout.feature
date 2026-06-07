Feature: Checkout functionality of SauceDemo Application

  Scenario: Complete product checkout successfully

    Given User is logged in
    When User adds product to cart
    And User opens shopping cart
    And User clicks on checkout button

    When User enters checkout information
    And User continues to checkout overview
    And User finishes the order

    Then Order should be placed successfully