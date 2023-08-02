@reviews
Feature: Homepage Login Test
  Scenario: Homepage log in with valid username and password
    Given i am on the homepage
    When i enter registered username in username textbox
    When i enter password in password textbox
    When i click on login button
    Then i must successfully login to the web page