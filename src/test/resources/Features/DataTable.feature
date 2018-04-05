#Author: Srinivas srinivas_padmakar@yahoo.com
#Keywords Summary : Cucumber basic examples - DataTableTest
#Feature: To check if we are able to fetch Data from tables.

@tag
Feature: To check if we are able to read Data from tables.

  @tag1
  Scenario: Checking the Below Syntax
    Given To Check Given From Table
      | Type             |
      | Given From Table |
    And To Check And From Table
      | Type           |
      | And From Table |
    When To Check When From Table
      | Type            |
      | When From Table |
    Then To Check Then From Table
      | Type            |
      | Then From Table |