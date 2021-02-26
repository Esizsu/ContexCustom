Feature: Verifying the MainPage

  @Products
  Scenario: Navigating and Verifying Products


    When User navigate and verifies that More products button is present
    Then User verifies that "accessories" is displayed
    Then User verifies that "hats" is displayed
    Then User verifies that "home-living" is displayed
    Then User verifies that "kids-youth-clothing" is displayed

    Then User verifies that "mens-clothing" is displayed
    Then User verifies that "womens-clothing" is displayed