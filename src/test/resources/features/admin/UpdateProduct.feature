Feature: Update product by Admin Functionality
  Background: Login admin with registered account
    Given already on login page
    And input email "admin@gmail.com"
    And input password "Kunti123"
    And click login button
    Then directed to admin page

#  @admineditproduct @positive @admin-w013
#  Scenario: Verify close button in edit product modal is enabled
#    Given click edit product button
#    When click close button edit modal
#    Then edit product modal should closed

  @admineditproduct @positive @admin-w021
  Scenario: Admin update product with valid data
    When click edit product button
    And input update product photo data
    And input update product name "Tenda Big Size 8 orang"
    And input update rent price "200k"
    And input update description "2 x 1.5 x 1.2 m"
    And click save data button modal
    Then the product should be edited
#
#  @admineditproduct @negative @admin-w022
#  Scenario: Admin update product without product photo data
#    When click edit product button
#    And input update product name "Tenda Big Size 8 orang"
#    And input update rent price "200k"
#    And input update description "2 x 1.5 x 1.2 m"
#    And click edit info button
#    Then the product should be edited
#
#  @admineditproduct @negative @admin-w023
#  Scenario: Admin update product without product name data
#    When click edit product button
#    And input update product photo data
#    And input update rent price "200k"
#    And input update description "2 x 1.5 x 1.2 m"
#    And click edit info button
#    Then the product should be edited
#
#  @admineditproduct @negative @admin-w024
#  Scenario: Admin update product without rent price data
#    When click edit product button
#    And input update product photo data
#    And input update product name "Tenda Big Size 8 orang"
#    And input update description "2 x 1.5 x 1.2 m"
#    And click edit info button
#    Then the product should be edited
#
#  @admineditproduct @negative @admin-w025
#  Scenario: Admin update product with description data
#    When click edit product button
#    And input update product photo data
#    And input update product name "Tenda Big Size 8 orang"
#    And input update rent price "200k"
#    And click edit info button
#    Then the product should be edited
#
#  @admindeleteproduct @positive @admin-w020
#  Scenario: Admin delete product functionality
#    When admin click delete button
#    Then the product should be deleted
