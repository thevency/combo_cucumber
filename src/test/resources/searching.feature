#@driver:chrome
Feature: Searching On The Internet
  Scenario Outline: Searching By Chrome
    Given Smi opens browser as "<address>"
    When Smi enters keyword as "<keyword>" to search box
    And Smi clicks on Search Button
    Then Smi should see result that contains "<result>"
    Examples:
      | address                    |keyword   | result                            |
      |http://www.google.com       | Zalo     | Zalo Web - Đăng nhập Zalo         |
      |http://www.google.com       | Line     | Line
