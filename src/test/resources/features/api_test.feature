
Feature: API Testing with Cucumber and Rest Assured
  @ADO_TC_12345
  Scenario: Validate API response
    Given I perform a GET request to the API
    Then the response status should be 200
