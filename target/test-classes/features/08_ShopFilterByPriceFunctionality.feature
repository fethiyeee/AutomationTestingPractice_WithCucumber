@shopFilterByPrice
Feature: Homepage Login Test
  Scenario: Shop filter by functionality
    Given i am on the homepage
    Then i click shop button
    Then i can adjust the filter by price between 150 to 450 rps
    When i click on Filter button
    Then i can see books only between 150 to 450 rps price

