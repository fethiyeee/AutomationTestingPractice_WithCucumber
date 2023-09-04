@shopSortByPopularity
Feature: Homepage Login Test
  Scenario: Shop product categories functionality
    Given i am on the homepage
    Then i click shop button
    When i click on Sort by Popularity item in Default sorting dropdown
    Then i can see the popular products only