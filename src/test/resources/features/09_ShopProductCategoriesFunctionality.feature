@shopProductCategories
Feature: Homepage Login Test
  Scenario: Shop product categories functionality
    Given i am on the homepage
    Then i click shop button
    When i click any of the product links available in the product category
    Then i can see only that particular product