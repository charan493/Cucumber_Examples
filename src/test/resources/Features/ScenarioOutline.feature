#Author: Srinivas srinivas_padmakar@yahoo.com
#Keywords Summary : Cucumber basic examples - ScenarioOutlineTest
#Feature: To check if we are able to fetch Data for
# different Scenarios using Scenario Outline.

@tag
Feature: To check if we are able to pass data using Scenario Outline.

  @tag1
  Scenario Outline: Pass parameters using scenario outline.
    Given To Check given From Table <sendGiven> is fetched
    And To Check and From Table <sendAnd> is fetched
    When To Check when From Table <sendWhen> is fetched
    Then To Check then From Table <sendThen> is fetched


    Examples:

      | sendGiven | sendAnd | sendWhen | sendThen |
      | Given1    | And1    | When1    | Then1    |
      | Given2    | And2    | When2    | Then2    |