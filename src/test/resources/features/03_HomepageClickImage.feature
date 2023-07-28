@clickImage
Feature: Homepage Arrival Test
  Scenario: Homepage arrivals are clickable
    Given i am on the homepage
    Then i should see at least three arrivals
    When i click image of arrivals
    Then i can add that book into the basket