Feature: Longest Substring Without Repeating Letters

  Scenario: Valid input with unique characters
    Given I am on the homepage
    When I enter "abcdefg" into the input field
    And I click the submit button
    Then I should see the output "7" on the result page

  Scenario: Valid input with repeating characters
    Given I am on the homepage
    When I enter "abcabcbb" into the input field
    And I click the submit button
    Then I should see the output "3" on the result page

  Scenario: Input with a single character
    Given I am on the homepage
    When I enter "a" into the input field
    And I click the submit button
    Then I should see the output "1" on the result page

  Scenario: Input with special characters
    Given I am on the homepage
    When I enter "!@#$%^&*" into the input field
    And I click the submit button
    Then I should see an error message on the result page