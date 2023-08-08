@logIn
Feature: Homepage Login Test

  Scenario Outline: log in with valid username and password
    Given i am on the homepage
    When i click my account button
    And i enter registered username in "<username>" textbox
    And i enter password in "<password>" textbox
    And i click on login button
    Then i must successfully login to the web page
    Examples: user credentials
      | username          | password    |
      | fethiye@gmail.com | fethiye2344 |