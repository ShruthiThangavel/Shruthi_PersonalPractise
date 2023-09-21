Feature: Ebay home Page behaviours

  @P1
  Scenario: Advanced link search
    Given User on Ebay home page
    When User clicks on Advanced search link
    Then User navigates to advance search page

  @P3
  Scenario: iPhone 11 is searched
    Given User on Ebay home page
    When I search for iphone11
    Then the number of search results are validated

  @P4 @SetCookies @Closed
  Scenario: Samsung is searched
    Given User on Ebay home page
    When The 'Samsung' is entered in textBox and searched
    Then the number of  results more than 1000 is validated

  @P5
  Scenario: baby soap is searched
    Given User on Ebay home page
    When The 'Soap' is entered in textBox and category 'bAbY' is searched
    Then the number of  results more than 1000 is validated

  @P7
  Scenario Outline: Validating links
    Given User on Ebay home page
    When User clicks the '<link>'
    Then User navigates to page with '<current url>' and '<title>'

    Examples: 
      | link        | current url                                          | title       |
      | Fashion     | https://www.ebay.com/b/Fashion/bn_7000259856         | Fashion     |
      | Electronics | https://www.ebay.com/b/Electronics/bn_7000259124     | Electronics |
      | Sports      | https://www.ebay.com/b/Sporting-Goods/888/bn_1865031 | Sporting    |
