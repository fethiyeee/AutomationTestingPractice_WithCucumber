@shopFilterByPrice
Feature: Homepage Login Test
  Scenario Outline: Shop filter by functionality
    Given i am on the homepage
    When i click shop button
    And i can adjust the filter by price between "<150>" to "<450>" rps
    And i click on Filter button
    And i can see books only between "<150>" to "<450>" rps price
    Examples: filters
      | 150 |450|
      | 150 |450|
