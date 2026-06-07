Feature: Cart functionality of SauceDemo Application

  Scenario Outline: Verify product is added to cart successfully

    Given User is logged in
    When User adds "<productName>" to cart
    And User opens shopping cart
    Then Cart should contain "<count>" items

    Examples:
      | productName           | count |
      | Sauce Labs Bike Light | 1     |