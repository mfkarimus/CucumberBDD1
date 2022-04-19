
Feature:Amazon log in test

  Background:
    Given User already in amazon home page

  Scenario: Right email and password
    When I enter valid email and valid password
    Then user should be able to login successfully


  Scenario: Wrong email and wrong password
    When I enter wrong email and wrong password
    Then user should not be able to login successfully


  Scenario: Right email and wrong password
    When I enter valid email and invalid password
    Then user could not be able to login correctly


  Scenario: Wrong email and right password
    When I enter invalid email and valid password
    Then user not  able to login successfully
