Feature: Udpdate climbers by Admin Functionality
  Background: Login admin with registered account
    Given admin input email "@gmail" and password "password"
    And admin click login button
    Then admin should success login
    When admin click users menu
    And climbers table appear

  @admineditclimbers @positive @admin-w031
  Scenario: Verify close button in edit climbers data modal is enabled
    Given click edit data button
    When click close button
    Then edit climbers data modal should closed

  @admineditclimbers @positive @admin-w032
  Scenario: Admin update climbers with valid data
    When click edit data button
    And input update isclimbers data 120
    And input update male climber 70
    And input update female climber 50
    And click edit info button
    Then the climbers should be edited

  @admineditclimbers @negative @admin-w033
  Scenario: Admin update climbers with invalid data
    When click edit data button
    And input update climbers data "seratus"
    And input update male climber "tujuh puluh"
    And input update female climber "tiga puluh"
    And click edit info button
    Then alert message should appear "please enter a valid value"

  @admineditclimbers @negative @admin-w034
  Scenario: Admin update climbers with empty isclimbers data
    When click edit data button
    And input update isclimbers data ""
    And input update male climber 70
    And input update female climber 50
    And click edit info button
    Then alert message should appear "please enter a valid value"

  @admineditclimbers @negative @admin-w035
  Scenario: Admin update climbers with empty male climber data
    When click edit data button
    And input update isclimbers data 120
    And input update male climber ""
    And input update female climber 50
    And click edit info button
    Then alert message should appear "please enter a valid value"

  @admineditclimbers @negative @admin-w036
  Scenario: Admin update climbers with empty female climber data
    When click edit data button
    And input update isclimbers data 120
    And input update male climber 70
    And input update female climber ""
    And click edit info button
    Then alert message should appear "please enter a valid value"
