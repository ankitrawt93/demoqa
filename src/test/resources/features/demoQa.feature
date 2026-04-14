Feature:DemoQA login

  Scenario Outline:valid login
    Given User is on DemoQA login page
    And user clicks on login btn
    And user lands on login page
    Then user is able to login with the username "<username>" and password "<password>"
    And user clicks on logout button
    Examples:
      | username   | password    |
      | ankrawone  | Anks@12345  |
      | anjrawone  | Anj@123456  |
      | andrawone  | And@12345   |
