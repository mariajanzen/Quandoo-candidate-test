Feature: Herokuapp Table feature
  In order to ensure that sorting is applied
  I sort data in table column

  Scenario: Sort data in Example 2 Table
    Given I am on the TablePage

    When I sort data by LastName
    Then I see ascending data

    When I sort data by LastName
    Then I see descending data

