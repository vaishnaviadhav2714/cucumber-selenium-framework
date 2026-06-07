Feature: Products functionality of SauceDemo Application

  Scenario Outline: Add products to cart

    Given User is logged in
    When User adds "<productName>" to cart
    Then Cart badge should show "<count>"

    Examples:
      | productName            | count |
      | Sauce Labs Backpack    | 1     |
      | Sauce Labs Bike Light  | 1     |