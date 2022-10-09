@Registration
Feature: Registration feature
  As a customer I want to Register

  Scenario:Validate Registration
    Given I am on the home page
    And I click on the Register
    And I select Gender Female
    And I enter following details to register
      | firstName | lastName | email          | password  | confirmPassword |
      | vedant    | khunt    | test12@gmail.com | hello@123 | hello@123       |

#    And I Enter FirstName "Vaibhavi"
#    And I enter LastName "Vyas"
#    And I Select Date Of Birth Day "03" Month "July" Year "1986"
#    And I Enter Email "<email>"
#    And I Enter Company Name "Sumatra"
#    And I Select newsletter
#    And I Enter Password "<password>"
#    And I Enter Confirm Password "<confirmPassword>"
    When I click on Register Button
    Then I should See Message"Your registration completed"
    And the url should contain with "/registerresult"

#    Examples:
#      | email                 | password   | confirmPassword |
#      | vaibhavi26@yahoo.com | password21 | password21      |
#      | vaibhavi27@yahoo.com | password22 | password22      |
#      | vaibhavi28@yahoo.com | password23 | password23      |
#      | vaibhavi29@yahoo.com | password24 | password24      |
#      | vaibhavi30@yahoo.com | password25 | password25      |

  Scenario Outline: LogIn with valid credentials
    Given I am on the home page
    When I click on the Log in
    Then I should see "Welcome, Please Sign In!" text on login page
    And the url should contain with "/login"
    And I enter email "<email>" and password "<password>"
    And I click on log in on login page
    Then I should see log out button displayed
    Examples:
      | email              | password   |
      | test12@gmail.com | hello@123|
#      | vaibhavi22@yahoo.com | password22 |
#      | vaibhavi23@yahoo.com | password23 |
#      | vaibhavi24@yahoo.com | password24 |
#      | vaibhavi25@yahoo.com | password25 |