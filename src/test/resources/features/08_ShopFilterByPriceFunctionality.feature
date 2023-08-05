@shopFilterByPrice
Feature: Homepage Login Test
  Scenario: Homepage log in with valid username and password
    Given i am on the homepage
    When i click shop button
    Then i can adjust the filter by price between 150 to 450 rps
    When i click on Filter button
    Then i can view books only between 150 to 450 rps price