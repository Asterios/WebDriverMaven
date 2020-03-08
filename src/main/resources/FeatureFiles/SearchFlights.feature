@Search-Flights
Feature: Acceptance testing to validate Lufthansa Page is working.
  In order to validate that 
  the Lufthansa page is working
  Doing the Acceptance Testing

  @Search-Flights-Positive
  Scenario: Validate Search Flights Lufthansa Page
    Given I am on the Home Page "https://www.lufthansa.com/lu/en/homepage" of Lufthansa Website
    When I choose From "Luxembourg"
    And To "Frankfurt"
    And click on Search_Flights button
    Then I should see list of searched flights
    And the page title should be "Lufthansa - Flight Selection"

    