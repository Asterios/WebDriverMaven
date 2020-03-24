@CP_Positive
Feature: Acceptance testing to validate Collateral Value Positive Test.
  In order to validate that 
  Collateral Value is calculated correctly
  Doing the Acceptance Testing

	@CP_Positive
  Scenario: Validate that account "13114" has collateral bigger than zero
    Given I am connected on the database
    When I do query for account "13114"
    Then the collateral value is bigger than zero
