
Feature: Acceptance testing to validate Newspaper Page is working.
  In order to validate that 
  the Newspaper page is working
  Doing the Acceptance Testing

  Scenario: Validate Newspaper page in news247
    Given I am on the Home Page "https://www.news247.gr/"
    When I click on newsapapers
    Then I should see the list of newsapapers
  

    