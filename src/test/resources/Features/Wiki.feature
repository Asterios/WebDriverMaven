@Wiki
Feature: Acceptance testing to validate Wikipedia Page is working.
  In order to validate that 
  the Wikipedia page is working
  Doing the Acceptance Testing

	@Wiki-Positive
  Scenario: Validate Software testing page in Wikipedia
    Given I am on the Home Page "https://en.wikipedia.org/wiki/Main_Page"
    When I search for "Software testing"
    Then I arrive at the page Software testing
    And I get the total number of links