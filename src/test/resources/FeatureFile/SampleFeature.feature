Feature: As a Amazon user I should be able to login and logout with valid credentials

  Scenario: Login into the application with valid credentials
  	Given I am on the Login page URL "https://www.amazon.in/"
    When I enter username as "testusername"
    And I Click on Continue button
    And I enter password as "testpassword"
    And click on login button
    Then I am logged in
 