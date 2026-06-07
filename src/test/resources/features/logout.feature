Feature: Logout functionality of SauceDemo Application

  Scenario: Verify user can logout successfully

    Given User is logged in
    When User opens application menu
    And User clicks logout option
    Then User should be navigated to login page