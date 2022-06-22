Feature: Login to a google.com


  Scenario: Logins to OrangeMG home page
    Given I launch Chrome browser
    When Enter user ID and password
    When click on Login
    Then Verify thatyou log in to the page