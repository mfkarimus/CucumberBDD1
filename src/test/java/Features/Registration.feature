Feature:Registration file test
  Scenario: create an account for registration
    Given User already in landing page

    When I enter valid information

    Then user should be submite all information successfully