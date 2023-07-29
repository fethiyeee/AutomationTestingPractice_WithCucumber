@description
Feature: Homepage Arrival Test
  Scenario: Homepage arrivals are clickable
    Given i am on the homepage
    Then i should see at least three arrivals
    When i click the image in the Arrivals
    Then i can see a description regarding that book