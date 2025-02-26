Feature: Instagram Login and Interaction

  Scenario Outline: User views the profile information of an Instagram user
    Given I am on the Instagram login page
    When I search for the username "<username>"
    Then I should see the posts count for the user "<username>"
    And I should see the followers count for the user "<username>"
    And I should see the followings count for the user "<username>"

    Examples:
      | username     |
      | mr.ekhhi     |
      | _imsudhanshu |
      | miamalkova   |
      | gaurav_comic |



