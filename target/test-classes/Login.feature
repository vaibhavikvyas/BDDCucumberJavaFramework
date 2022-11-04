@Login



Feature: LogIn feature
  As a customer
  I want to LogIn

  Scenario:Validate LogIn Page
    Given I am on the home page
    When I click on the Log in
    Then I should see "Welcome, Please Sign In!" text on login page
    And the url should contain with "/login"
