Feature: Product Sorting

  Scenario Outline: Verify product sorting functionality

    Given User is logged in
    When User selects "<sortOption>" sorting option
    Then Products should be sorted correctly for "<sortOption>"

    Examples:
      | sortOption          |
      | Name (A to Z)       |
      | Name (Z to A)       |
      | Price (low to high) |
      | Price (high to low) |