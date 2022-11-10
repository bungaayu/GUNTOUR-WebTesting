Feature: login


  #pendaki
  Scenario: Successfully logged in as pendaki
    Given I already on log in page
    When I input email "nyusdjaja30@gmail.com"
    And I input password "Araa1989"
    And I click login button
    Then Should be directed to Home Page


    #ranger
  Scenario: Successfully logged in as ranger
    Given I already on log in page
    When I input email "nyusdjaja@gmail.com"
    And I input password "Araa1989"
    And I click login button
    Then Should be directed to Home Page


    #admin
  Scenario: Successfully logged in as admin
    Given I already on log in page
    When I input email "admin@gmail.com"
    And I input password "Kunti123"
    And I click login button
    Then Should be directed to Home Page