Feature: Login from test
  Scenario: Elements should be present
    When I open litecart main page
    Then I make sure that elements are present: email address, password, login button

  Scenario: Sale stickers should be present
    When I open litecart main page
    Then I make sure that sale stickers are present