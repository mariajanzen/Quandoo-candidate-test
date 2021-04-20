Feature: Herokuapp Login Feature
  In order to log in successfully
  I insert valid credentials

  Scenario: Successful Login
    Given I am on the LoginPage
    When I insert valid user credentials
    Then I see correct SecureArea
