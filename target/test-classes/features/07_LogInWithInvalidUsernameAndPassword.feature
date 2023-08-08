@logIn2
Feature: Homepage Login Test

  Scenario Outline: log in with invalid username and password
    Given i am on the homepage
    When i click my account button
    And i enter invalid username in "<username>" textbox
    And i enter invalid password in "<password>" textbox
    And i click on login button
    Then i must see error message
    Examples: user credentials
      | username      | password  |
      | fty@gmail.com | fethiye23 |