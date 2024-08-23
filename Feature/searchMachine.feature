Feature: searchMachine
  Scenario Outline: i search on google chrome
    Given i am on google search
    When i enter "<product_name>" in the search bar
    And i click search button
    Then i can see the search result successfully
    Examples:
    |product_name|
    |shoes         |
    |toy           |
    |shirt         |

