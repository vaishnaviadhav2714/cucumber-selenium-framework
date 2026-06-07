Feature: Login Functionality of SauceDemo Application

  Scenario Outline: Verify login is successful for valid users

    Given User is on login page
    When User enters username "<username>" and password "<password>"
    And User clicks on login button
    Then User should be navigated to products page

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |


  Scenario: Verify locked out user cannot login

    Given User is on login page
    When User enters username "locked_out_user" and password "secret_sauce"
    And User clicks on login button
    Then User should see locked out user error message