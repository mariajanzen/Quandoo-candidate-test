Feature: Herokuapp Login Feature
  In order to log in
  I insert different credentials

  Scenario: Successful Login
    Given I am on the LoginPage
    When I insert valid username
    And I insert valid password
    Then I see correct SecureArea

  Scenario: Invalid Username
    Given I am on the LoginPage
    When I insert invalid username
    And I insert valid password
    Then I see error username message

  Scenario: Invalid Password
    Given I am on the LoginPage
    When I insert valid username
    And I insert invalid password
    Then I see error password message
