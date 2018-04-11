#Author: Srinivas srinivas_padmakar@yahoo.com
#Keywords Summary : Cucumber basic examples - CustomeClassTest
#Feature: To check if we are able to fetch Data from tables dynamically.

@tag
Feature: To check if we are able to read Data from tables dynamically.

  @tag1
  Scenario: Checking the Below Syntax
    Given To Check Given From Table Dynamically
      | given            |
      | Given From Table |
    And To Check And From Table Dynamically
      | and            |
      | And From Table |
    When To Check When From Table Dynamically
      | when            |
      | When From Table |
    Then To Check Then From Table Dynamically
      | then            |
      | Then From Table |