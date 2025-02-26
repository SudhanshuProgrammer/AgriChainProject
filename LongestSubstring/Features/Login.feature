Feature: Instagram Login and Interaction

  Scenario: User logs into Instagram, takes a screenshot of their profile, and count the number of posts followers and followings
    Given I am on the Instagram login page
    When I enter my username and password
    And I click on the login button
    Then I should be redirected to my profile page
    And I take a screenshot of my profile page
    When I can see the count of posts,followers and followings
    Then Click on Logout button


