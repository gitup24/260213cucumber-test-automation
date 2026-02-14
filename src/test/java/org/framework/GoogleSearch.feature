//description
Feature: Google Search
//Description
  As a user, I want to test google search function
//Scenarios and title
  Scenario: Basic search
    //prerequisites - Action / Result expected
    Given I open google search page

    When I lookup the word "selenium"

    Then search results display the word "selenium"