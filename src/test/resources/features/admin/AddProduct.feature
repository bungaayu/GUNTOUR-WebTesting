Feature: Admin add product by functionality
  Background: Login admin with registered account
    Given already on login page
    And input email "admin@gmail.com"
    And input password "Kunti123"
    And click login button
    Then directed to admin page
#    When click product menu
#    And products table appear

  @adminaddproduct @positive @admin-w007
  Scenario: Verify close button in add product modal is enabled
    Given click add product button
    When click close button add modal
    Then add product modal should closed

  @adminaddproduct @positive @admin-w014
  Scenario: Admin add product with valid data
    When click add product button
    And input product photo data
    And input product name "Tenda Big Size"
    And input rent price "100000"
    And input description "2 x 1.5 x 1 m"
    And input warning "Harap dikembalikan dalam keadaan bersih"
    And click save data button modal
    Then the product should be added to table

  @adminaddproduct @negative @admin-w015
  Scenario: Admin add product with invalid rent price data
    When click add product button
    And input product photo data
    And input product name "Tenda Big Size"
    And input rent price "@!!!"
    And input description "2 x 1.5 x 1 m"
    And input warning "Dikembalikan dalam keadaan bersih"
    And click save data button modal
    Then alert message should appear "There is an error please check again"

  @adminaddproduct @negative @admin-w016
  Scenario: Admin add product without product photo data
    When click add product button
    And input product name "Tenda Big Size"
    And input rent price "100000"
    And input description "2 x 1.5 x 1 m"
    And input warning "Dikembalikan dalam keadaan bersih"
    And click save data button modal
    Then alert message should appear "There is an error please check again"

  @adminaddproduct @negative @admin-w017
  Scenario: Admin add product without product name data
    When click add product button
    And input product photo data
    And input rent price "100000"
    And input description "2 x 1.5 x 1 m"
    And input warning "Dikembalikan dalam keadaan bersih"
    And click save data button modal
    Then alert message should appear "There is an error please check again"

  @adminaddproduct @negative @admin-w018
  Scenario: Admin add product without rent price data
    When click add product button
    And input product photo data
    And input product name "Tenda Big Size"
    And input description "2 x 1.5 x 1 m"
    And input warning "Dikembalikan dalam keadaan bersih"
    And click save data button modal
    Then alert message should appear "There is an error please check again"

  @adminaddproduct @negative @admin-w019
  Scenario: Admin add product without description data
    When click add product button
    And input product photo data
    And input product name "Tenda Big Size"
    And input rent price "100000"
    And input warning "Dikembalikan dalam keadaan bersih"
    And click save data button modal
    Then alert message should appear "There is an error please check again"

  @adminaddproduct @negative @admin-w020
  Scenario: Admin add product without note data
    When click add product button
    And input product photo data
    And input product name "Tenda Big Size"
    And input rent price "100000"
    And input description "2 x 1.5 x 1 m"
    And click save data button modal
    Then alert message should appear "There is an error please check again"