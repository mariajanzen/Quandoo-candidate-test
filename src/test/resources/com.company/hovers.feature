Feature: Herokuapp hovers feature
  In order to verify the displaying text with user counter
  I hover over the avatars

  Scenario: Hover over the pictures
    Given I am on the HoversPage
    When I hover over the profile pictures
    Then I see the user information under the picture
